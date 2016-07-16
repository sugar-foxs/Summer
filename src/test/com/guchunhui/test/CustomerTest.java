package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarService;
import com.guchunhui.utils.CustomerUtilService;
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
    private CustomerUtilService customerUtilService;

    @Autowired
    public void setCustomerUtilService(CustomerUtilService customerUtilService) {
        this.customerUtilService = customerUtilService;
    }

    @Test
    public void insertCustomer(){
        Customer customer = new Customer();
        customer.setCustomerName("cxh");
        customer.setCustomerPassword("123456");
        customer.setCustomerPhone("18251825790");
        customer.setCustomerEmail("2290584780@qq.com");
        customerUtilService.insertNewCustomer(customer);
    }

    @Test
    public void findCustomerById(){
        Customer customer = customerUtilService.findCustomerById(1);
        System.out.print("id号:"+customer.getCustomerId()+" "
                +"姓名："+customer.getCustomerName()+" "
                +"电话："+customer.getCustomerPhone()+" "
                +"邮箱："+customer.getCustomerEmail()+" "
        );
    }

    @Test
    public void findAllCutomers(){
        List<Customer> customerList = customerUtilService.findAllCustomers();
        for(Customer customer:customerList){
            System.out.println("id号:"+customer.getCustomerId()+" "
                    +"姓名："+customer.getCustomerName()+" "
                    +"电话："+customer.getCustomerPhone()+" "
                    +"邮箱："+customer.getCustomerEmail()+" "
            );
        }
    }

    @Test
    public void deleteCustomerById(){
        customerUtilService.deleteCustomerById(2);
    }




}
