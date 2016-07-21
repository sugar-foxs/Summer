package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.utils.CustomerUtilService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gch on 16-7-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class CustomerUtilTest {
    @Autowired
    private CustomerUtilService customerUtilService;

    @Test
    public void insertCustomer(){
        Customer customer = new Customer();
        customer.setCustomerName("hhh");
        customer.setCustomerPassword("123");
        customer.setCustomerPhone("18251825790");
        customer.setCustomerEmail("2290584780@qq.com");
        customerUtilService.insertNewCustomer(customer);
    }

    @Test
    public void findCustomerById(){
        System.out.print(customerUtilService.findCustomerById(1));
    }

    @Test
    public void deleteCustomerById(){
        customerUtilService.deleteCustomerById(5);
    }

    @Test
    public void findAllCustomers(){
        List<Customer> customerList = customerUtilService.findAllCustomers();
        for(Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
