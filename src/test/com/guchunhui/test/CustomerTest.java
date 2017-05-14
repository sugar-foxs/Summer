package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import com.guchunhui.utils.MD5Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;


/**
 * Created by gch on 16-5-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml"})

public class CustomerTest {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private MD5Service md5Service;


    @Test
    public void insertCustomer() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Customer customer = new Customer();
        customer.setCustomerName("cxh");
        customer.setCustomerPassword(md5Service.EncoderByMd5("#123456$"));
        customer.setCustomerPhone("18251825790");
        customer.setCustomerEmail("2290584780@qq.com");
        customerService.insertCustomer(customer);
    }

    @Test
    public void findCustomerById(){
        Customer customer = customerService.findCustomerById(1);
        System.out.print(customer.getShoppingCar().getShoppingCarItemsList());
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
