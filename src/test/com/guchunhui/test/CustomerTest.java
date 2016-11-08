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
@ContextConfiguration(locations = {"classpath:spring.xml"})

public class CustomerTest {
    @Autowired
    private CustomerService customerService;



    @Test
    public void insertCustomer(){
        Customer customer = new Customer();
        customer.setCustomerName("cxh");
        customer.setCustomerPassword("123456");
        customer.setCustomerPhone("18251825790");
        customer.setCustomerEmail("2290584780@qq.com");
        customerService.insertCustomer(customer);
    }

    @Test
    public void findCustomerById(){
        Customer customer = customerService.findCustomerById(2);
        System.out.print(customer);
    }

    @Test
    public void findAllCustomers(){
        List<Customer> customerList = customerService.findAllCustomers();
        for(Customer customer:customerList){
            System.out.println(customer);
        }
    }

    @Test
    public void deleteCustomerById(){
        customerService.deleteCustomerById(3);
    }




}
