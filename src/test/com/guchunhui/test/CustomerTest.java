package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by gch on 16-5-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class CustomerTest {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Test
    public void insertCustomer(){
        Customer customer = new Customer();
        customer.setCustomerName("GC");
        customerService.insertCustomer(customer);
    }

    @Test
    public void findCustomerById(){
        Customer customer = customerService.findCustomerById(33);
        System.out.print(customer.getCustomerId()+" "+customer.getCustomerName());
    }

    @Test
    public void findAllCutomers(){
        List<Customer> customerList = customerService.findAllCustomers();
        for(Customer customer:customerList){
            System.out.print(customer.getCustomerId()+" ");
            System.out.println(customer.getCustomerName());
        }
    }

    @Test
    public void deleteCustomer(){
        customerService.deleteCustomerById(3);
    }




}
