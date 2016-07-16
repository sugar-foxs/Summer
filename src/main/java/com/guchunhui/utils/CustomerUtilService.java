package com.guchunhui.utils;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gch on 16-6-11.
 */
@Service("customerUtilService")
public class CustomerUtilService {
    private CustomerService customerService;
    private ShoppingCarService shoppingCarService;
    private ShoppingCarUtilService shoppingCarUtilService;

    @Autowired
    public void setShoppingCarUtilService(ShoppingCarUtilService shoppingCarUtilService) {
        this.shoppingCarUtilService = shoppingCarUtilService;
    }

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Autowired
    public void setShoppingCarService(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    public void insertNewCustomer(Customer customer){
//        List<Customer> customers = customerService.findAllCustomers();
//        long id = customers.get(customers.size()-1).getCustomerId()+1;
//        customer.setCustomerId(id);
//        customer.setShoppingCarId(id);
        customerService.insertCustomer(customer);
//        ShoppingCar shoppingCar = new ShoppingCar();
//        shoppingCar.setShoppingCarId(id);
//        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    public Customer findCustomerById(long id){
        Customer customer = customerService.findCustomerById(id);
//        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getShoppingCarId());
//        customer.setShoppingCar(shoppingCar);
        return customer;
    }

    public List<Customer> findAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomers();
//        for(Customer customer : customerList){
//            ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getShoppingCarId());
//            customer.setShoppingCar(shoppingCar);
//        }
        return customerList;
    }

    public void deleteCustomerById(long id){
        customerService.deleteCustomerById(id);
//        shoppingCarService.deleteShoppingCarById(id);
    }
}
