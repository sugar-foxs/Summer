package com.guchunhui.controller;

import com.guchunhui.model.Book;
import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gch on 16-4-13.
 */
@Controller
public class CustomerController{


      @Autowired
      private CustomerService customerService;

      @Autowired
      private ShoppingCarUtilService shoppingCarUtilService;

      //找到所有顾客
      @ResponseBody
      @RequestMapping(value = "/customer/findall")
      public List<Customer> findAllCustomers(){
            List<Customer> customerList = customerService.findAllCustomers();
            return customerList;
      }

      //删除账号，不使用
      @ResponseBody
      @RequestMapping(value = "/customer/delete")
      public String deleteCustomer(HttpServletRequest request){
            String id = request.getParameter("id");
            customerService.deleteCustomerById(Long.parseLong(id));
            return "delete successfully";
      }

      //通过id找顾客
      @ResponseBody
      @RequestMapping(value = "/customer/findcustomerbyid")
      public Customer findCustomerById(HttpServletRequest request){
            String id = request.getParameter("customerid");
            Customer customer = customerService.findCustomerById(Integer.parseInt(id));
            return customer;
      }


      //登陆请求
      @RequestMapping(value = "/login")
      public String login(HttpServletRequest request,Model model,HttpSession httpSession,HttpServletResponse response) throws UnsupportedEncodingException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            List<Customer> customerList = customerService.findAllCustomers();
            if(username.length() == 0){
                  model.addAttribute("error","用户名为空");
                  return "login";
            }
            if(password.length() == 0){
                  model.addAttribute("error","密码为空");
                  return "login";
            }
            if(customerList != null){
                  for(Customer customer : customerList){
                        if(customer.getCustomerName().equals(username)){
                              if(customer.getCustomerPassword().equals(password)){
                                    model.addAttribute("customer",customer);

                                    httpSession.setAttribute("customer",customer);
                                    httpSession.setMaxInactiveInterval(30*60);

                                    ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId());
//                                    HashMap<String ,Long> map =new HashMap<String, Long>();
//                                    for(Book book:bookList){
//                                          map.put(String.valueOf(book.getBookId()),map.containsKey(String.valueOf(book.getBookId()))?map.get(String.valueOf(book.getBookId()))+1:1);
//                                    }
//                                    String booksId = "";
//                                    String counts = "";
//                                    for(Map.Entry<String, Long> entry:map.entrySet()){
//                                          booksId += entry.getKey()+",";
//                                          counts += entry.getValue()+",";
//                                    }
//                                    Cookie cookie = new Cookie(customer.getCustomerName()+"_books",booksId.trim());
//                                    Cookie cookie2 = new Cookie(customer.getCustomerName()+"_counts",counts.trim());

                                    Cookie cookie1 = new Cookie("shop",shoppingCar.serialize());
                                    response.addCookie(cookie1);
//                                    cookie.setMaxAge(30*60);
//                                    cookie2.setMaxAge(30*60);
//
//                                    response.addCookie(cookie);
//                                    response.addCookie(cookie2);

                                    return "forward:loginSuccess/"+username+".do";
                              }else{
                                    model.addAttribute("error","密码错误");
                                    return "login";
                              }
                        }
                  }
                  model.addAttribute("error","用户名不存在");
                  return "login";
            }else{
                  model.addAttribute("error","无用户");
                  return "login";
            }
      }

      //注册请求，如果成功去登陆
      @RequestMapping(value = "/register")
      public String register(Customer customer,Model model) throws UnsupportedEncodingException {
            String usernameRegex = "^[A-Za-z][A-Za-z1-9_-]+$";
            String passwordRegex = "^[0-9a-zA-Z]{6,16}$";
            String phoneRegex = "^1[3|4|5|8][0-9]\\d{8}$";
            String emailRegex = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
            Pattern pattern = Pattern.compile(usernameRegex);
            Matcher matcher = pattern.matcher(customer.getCustomerName());
            Pattern pattern2 = Pattern.compile(passwordRegex);
            Matcher matcher2 = pattern2.matcher(customer.getCustomerPassword());
            Pattern pattern3 = Pattern.compile(phoneRegex);
            Matcher matcher3 = pattern3.matcher(customer.getCustomerPhone());
            Pattern pattern4 = Pattern.compile(emailRegex);
            Matcher matcher4 = pattern4.matcher(customer.getCustomerEmail());
            if(!matcher.matches()){
                  model.addAttribute("error","用户名格式不对");
                  return "register";
            }
            if(!matcher2.matches()){
                  model.addAttribute("error","密码格式不对");
                  return "register";
            }
            if(customer.getCustomerPhone()!=null&&!"".equals(customer.getCustomerPhone())){
                  if(!matcher3.matches()){
                        model.addAttribute("error","手机号码格式不对");
                        return "register";
                  }
            }
            if(customer.getCustomerEmail()!=null&&!"".equals(customer.getCustomerEmail())){
                  if(customer.getCustomerEmail()!=null&&!matcher4.matches()){
                        model.addAttribute("error","邮箱格式不对");
                        return "register";
                  }
            }

            List<Customer> customerList = customerService.findAllCustomers();
            for(Customer customer2 :customerList){
                  if(customer2.getCustomerName().equals(customer.getCustomerName())){
                        model.addAttribute("error","用户名已存在");
                        return "register";
                  }
            }
//            System.out.print(customer.getCustomerName());
            customerService.insertCustomer(customer);
            return "registersuccessfully";
      }

      //登陆成功，去主页面
      @RequestMapping(value = "/loginSuccess/{username}")
      public String loginSuccess(@PathVariable String username,Model model) throws UnsupportedEncodingException {
            Customer customer = customerService.findCustomerByName(username);
            model.addAttribute(customer);
//            System.out.print(customer);
            return "main";
      }

      //去登陆页面
      @RequestMapping(value = "/gologin")
      public String login(HttpSession session) {
            Customer customer = (Customer) session.getAttribute("customer");
            if(customer!=null){
                  return "forward:loginSuccess/"+customer.getCustomerName()+".do";
            }else{
                  return "login";
            }
      }

      //去注册页面
      @RequestMapping(value = "/goregister")
      public String register() {
            return "register";
      }

    /**
     * 注销
     * @param session
     * @return
     */
      @RequestMapping(value = "/logout")
      public String logout(HttpSession session){
            session.invalidate();
            return "login";
      }
}
