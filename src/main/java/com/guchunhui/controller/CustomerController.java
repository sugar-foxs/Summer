package com.guchunhui.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import com.guchunhui.utils.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController  {

      private AuthenticationService authenticationService;

      @Autowired
      public void setCustomerValidatorService(AuthenticationService authenticationService){
            this.authenticationService=authenticationService;
      }

      private static final Log logger= LogFactory.getLog(CustomerController.class);


      @ResponseBody
      @RequestMapping(value = "/findall")
      public List<Customer> findAllCustomers(){
            List<Customer> customerList = authenticationService.findAllCustomers();
            return customerList;
      }




      @RequestMapping(value="/register")
      public String insertCustomer(HttpServletRequest request, Model model) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String id = request.getParameter("id");

            if (!username.equals("") && !password.equals("")) {
                  Customer customer = new Customer();
                  customer.setCustomerName(username);
                  customer.setCustomerPassword(password);
                  customer.setCustomerPhone(phone);
                  customer.setCustomerAddress(address);
                  customer.setCustomerEmail(email);
                  customer.setCustomerId(Long.parseLong(id));

                  List<Customer> customerList = authenticationService.findAllCustomers();
                  Boolean have = false;
                  if(customerList!=null){
                        for (Customer customers:customerList){
                              if(customers.getCustomerName().equals(customer.getCustomerName())){
                                    have=true;
                                    break;
                              }
                        }
                  }
                  if(!have){
                        authenticationService.insertCustomer(customer);
                        return "login";
                  }else{
                        model.addAttribute("error","用户名已存在");
                        return "register";
                  }
            }else{
                  model.addAttribute("error2","请输入用户名和密码");
                  return "register";
            }

      }


//                  List<Customer> customerList = authenticationService.findAllCustomers();


      @ResponseBody
      @RequestMapping(value = "/delete")
      public String deleteCustomer(HttpServletRequest request){
            String id = request.getParameter("customerId");
            authenticationService.deleteCustomerById(Long.parseLong(id));
            return "delete successfully";
      }

      @ResponseBody
      @RequestMapping(value = "/findcustomerbyid")
      public Customer findCustomerById(HttpServletRequest request){
            String id = request.getParameter("customerid");
            Customer customer = authenticationService.findCustomerById(Integer.parseInt(id));
            return customer;
      }


      @RequestMapping(value = "/login")
      @ResponseBody
      public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Model model) throws UnsupportedEncodingException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            List<Customer> customerList = authenticationService.findAllCustomers();
            if(username.length() == 0){
                  model.addAttribute("error","用户名为空");
                  return new ModelAndView("login");
            }else{
                  if(password.length() == 0){
                        model.addAttribute("error","密码为空");
                        return new ModelAndView("login");
                  }else{
                        if(customerList != null){
                              for(Customer customer : customerList){
                                    if(customer.getCustomerName().equals(username)){
                                          if(customer.getCustomerPassword().equals(password)){
                                                model.addAttribute("customer",customer);
//                                                addCookie(customer.getCustomerName(),customer.getCustomerPassword(),response,request);
                                                return new ModelAndView("taobao","customer",customer);
                                          }else{
                                                model.addAttribute("error","密码错误");
                                                return new ModelAndView("login");
                                          }
                                    }
                              }
                              model.addAttribute("error","用户名不存在");
                              return new ModelAndView("login");
                        }else{
                              model.addAttribute("error","无用户");
                              return new ModelAndView("login");
                        }
                  }
            }
      }

//      private void addCookie(String name, String password, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
//            if(StringUtils.isNotBlank(name)&&StringUtils.isNotBlank(password)){
//                  //创建Cookie
//                  Cookie nameCookie=new Cookie("name", URLEncoder.encode(name,"utf-8"));
//                  Cookie pswCookie=new Cookie("psw",password);
//
//                  //设置Cookie的父路径
//                  nameCookie.setPath(request.getContextPath()+"/");
//                  pswCookie.setPath(request.getContextPath()+"/");
//
//                  //获取是否保存Cookie
//                  String rememberMe=request.getParameter("rememberMe");
//                  if(rememberMe==null){//不保存Cookie
//                        nameCookie.setMaxAge(0);
//                        pswCookie.setMaxAge(0);
//                  }else{//保存Cookie的时间长度，单位为秒
//                        nameCookie.setMaxAge(7*24*60*60);
//                        pswCookie.setMaxAge(7*24*60*60);
//                  }
//                  //加入Cookie到响应头
//                  response.addCookie(nameCookie);
//                  response.addCookie(pswCookie);
//            }
//      }



}
