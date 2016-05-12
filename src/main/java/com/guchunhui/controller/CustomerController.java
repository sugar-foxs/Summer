package com.guchunhui.controller;

import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController  {

//      private CustomerService customerService;
//
//      @Autowired
//      public void setCustomerService(CustomerService customerService) {
//            this.customerService = customerService;
//      }
//
//      @RequestMapping(value = "/insert")
//      public String insertCustomer(){
//            Customer customer = new Customer();
//            customer.setCustomerName("gch");
//            customer.setCustomerId(2);
////            System.out.println("hh");
//            customerService.insertCustomer(customer);
//            return "html5";
//      }

}
