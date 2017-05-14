package com.guchunhui.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gch on 16-12-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ShoppingCarUtilServiceTest {
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;
    @Test
    public void getItemsFromCar() throws Exception {
        System.out.print(shoppingCarUtilService.getItemsFromCarByCustomerId(1));
    }

    @Test
    public void cleanCar(){
        shoppingCarUtilService.cleanShoppingCarById(1);
    }

    @Test
    public void addBookToCar(){
        shoppingCarUtilService.addBookIntoCar(2,3,1);
    }

    @Test
    public void deleteThisBookFromCar(){
        shoppingCarUtilService.deleteThisBookFromCar(1,2);
    }

}