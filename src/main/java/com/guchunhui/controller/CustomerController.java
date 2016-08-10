package com.guchunhui.controller;

import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
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


      @Resource
      private CustomerService customerService;

      @ResponseBody
      @RequestMapping(value = "/insert")
      public void insertCustomer(){
//            Customer customer = new Customer();
//            customer.setCustomerName("cxh");
//            customer.setCustomerPassword("123456");
//            customer.setCustomerPhone("18251825790");
//            customer.setCustomerEmail("2290584780@qq.com");
//            customerService.insertCustomer(customer);
      }
      @ResponseBody
      @RequestMapping(value = "/findall")
      public List<Customer> findAllCustomers(){
            List<Customer> customerList = customerService.findAllCustomers();
            return customerList;
      }

      @ResponseBody
      @RequestMapping(value = "/delete")
      public String deleteCustomer(HttpServletRequest request){
            String id = request.getParameter("id");
            customerService.deleteCustomerById(Long.parseLong(id));
            return "delete successfully";
      }

      @ResponseBody
      @RequestMapping(value = "/findcustomerbyid")
      public Customer findCustomerById(HttpServletRequest request){
            String id = request.getParameter("customerid");
            Customer customer = customerService.findCustomerById(Integer.parseInt(id));
            return customer;
      }


      @RequestMapping(value = "/login")
      @ResponseBody
      public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Model model) throws UnsupportedEncodingException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            List<Customer> customerList = customerService.findAllCustomers();
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
