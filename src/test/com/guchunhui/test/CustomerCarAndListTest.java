package com.guchunhui.test;

import com.guchunhui.model.CustomerCarAndList;
import com.guchunhui.service.CustomerCarAndListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gch on 16-7-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class CustomerCarAndListTest {

    private CustomerCarAndListService customerCarAndListService;

    @Autowired
    public void setCustomerCarAndListService(CustomerCarAndListService customerCarAndListService) {
        this.customerCarAndListService = customerCarAndListService;
    }

    @Test
    public void insert(){
        CustomerCarAndList customerCarAndList = new CustomerCarAndList();
        customerCarAndList.setCustomerId(2);
        customerCarAndList.setShoppingCarId(2);
        customerCarAndList.setShoppingListId(2);
        customerCarAndListService.insertCustomerCarAndList(customerCarAndList);
    }

    @Test
    public void delete(){
        customerCarAndListService.deleteCarAndListById(2);
    }

    @Test
    public void findCarAndList(){
        CustomerCarAndList customerCarAndList = customerCarAndListService.findCustomerCarAndListById(1);
        System.out.print(customerCarAndList);
    }
}
