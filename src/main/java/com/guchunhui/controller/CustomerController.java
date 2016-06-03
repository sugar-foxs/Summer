package com.guchunhui.controller;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

      private CustomerService customerService;

      private ShoppingCarService shoppingCarService;

      @Autowired
      public void setShoppingCarService(ShoppingCarService shoppingCarService) {
            this.shoppingCarService = shoppingCarService;
      }

      @Autowired
      public void setCustomerService(CustomerService customerService) {
            this.customerService = customerService;
      }

      @RequestMapping(value = "/insert")
      public @ResponseBody
      void insertCustomer(){
            Customer customer = new Customer();
            customer.setCustomerName("gch");
            customer.setCustomerId(2);
            customerService.insertCustomer(customer);
      }

      @RequestMapping(value = "/findall")
      public @ResponseBody
      List<Customer> findCustomers(){
            List<Customer> customerList = customerService.findAllCustomers();
            for(Customer customer : customerList){
                  int shoppingcarId = customer.getShoppingcarId();
                  ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(shoppingcarId);
                  customer.setShoppingCar(shoppingCar);
            }
            return customerList;
      }

      @RequestMapping(value = "/findcustomerbyid")
      public @ResponseBody
      Customer findCustomerById(HttpServletRequest request){
            String id = request.getParameter("Customerid");
            Customer customer = customerService.findCustomerById(Integer.parseInt(id));
            int shoppingcarId = customer.getShoppingcarId();
            ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(shoppingcarId);
            customer.setShoppingCar(shoppingCar);
            return customer;
      }





}
