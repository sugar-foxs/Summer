package com.guchunhui.utils;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-6-11.
 */
@Service("customerUtilService")
public class CustomerUtilService {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ShoppingCarService shoppingCarService;
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;


    public void insertNewCustomer(Customer customer){
        customerService.insertCustomer(customer);
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setCustomer(customer);
        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    public Customer findCustomerById(long id){
        Customer customer = customerService.findCustomerById(id);
        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(id);
//        customer.setShoppingCar(shoppingCar);
        return customer;
    }

    public List<Customer> findAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomers();
        for(Customer customer : customerList){
            ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId());
//            customer.setShoppingCar(shoppingCar);
        }
        return customerList;
    }

    public void deleteCustomerById(long id){
        customerService.deleteCustomerById(id);
//        customerCarAndListService.deleteCarAndListById(id);
        shoppingCarService.deleteShoppingCarById(id);
    }
}
