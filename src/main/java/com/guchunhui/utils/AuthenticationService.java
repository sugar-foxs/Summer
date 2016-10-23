package com.guchunhui.utils;

import com.guchunhui.mapper.CustomerMapper;
import com.guchunhui.model.Customer;
import com.guchunhui.model.CustomerForm;
import com.guchunhui.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xin on 16-10-22.
 */
@Service("authenticationService")
public class AuthenticationService {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Customer> findAllCustomers(){
        return customerService.findAllCustomers();
    }

    public void insertCustomer(Customer customer){
        customerService.insertCustomer(customer);
    }

    public Customer findCustomerById(Integer id){
        return customerService.findCustomerById(id);
    }

    public boolean validate(CustomerForm customerForm){

        List<Customer> customerList = customerService.findAllCustomers();
        String name= customerForm.getCustomerName();
        String password = customerForm.getCustomerPassword();
        for(Customer customer:customerList){
            if(customer.getCustomerName().equals(name) && customer.getCustomerPassword().equals(password)){
                return true;
            }

        }
        return false;


    }

    public void deleteCustomerById(Long id){
        customerService.deleteCustomerById(id);
    }
}
