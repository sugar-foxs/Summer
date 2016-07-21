package com.guchunhui.utils;

import com.guchunhui.model.Customer;
import com.guchunhui.model.CustomerCarAndList;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerCarAndListService;
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
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerCarAndListService customerCarAndListService;
    @Autowired
    private ShoppingCarService shoppingCarService;
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;


    public void insertNewCustomer(Customer customer){
        List<Customer> customers = customerService.findAllCustomers();
        long id = customers.get(customers.size()-1).getCustomerId()+1;
        customer.setCustomerId(id);
        customerService.insertCustomer(customer);
        CustomerCarAndList customerCarAndList = new CustomerCarAndList();
        customerCarAndList.setCustomerId(id);
        customerCarAndList.setShoppingCarId(id);
        customerCarAndList.setShoppingListId(id);
        customerCarAndListService.insertCustomerCarAndList(customerCarAndList);
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setShoppingCarId(id);
        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    public Customer findCustomerById(long id){
        Customer customer = customerService.findCustomerById(id);
        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(id);
        customer.setShoppingCar(shoppingCar);
        return customer;
    }

    public List<Customer> findAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomers();
        for(Customer customer : customerList){
            ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId());
            customer.setShoppingCar(shoppingCar);
        }
        return customerList;
    }

    public void deleteCustomerById(long id){
        customerService.deleteCustomerById(id);
        customerCarAndListService.deleteCarAndListById(id);
        shoppingCarService.deleteShoppingCarById(id);
    }
}
