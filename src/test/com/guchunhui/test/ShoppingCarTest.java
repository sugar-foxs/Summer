package com.guchunhui.test;

import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.ShoppingCarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gch on 16-6-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ShoppingCarTest {

    @Autowired
    private ShoppingCarService shoppingCarService;

    @Test
    public void findShoppingCarById(){
        ShoppingCar shoppingCar = shoppingCarService.findCarByCustomerId(1);
        System.out.print(shoppingCar);
    }

    @Test
    public void insertShoppingCar(){
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setCustomerId(2);
        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    @Test
    public void deleteShoppingCarById(){
        shoppingCarService.deleteCarByCustomerId(9);
    }



}
