package com.guchunhui.test;

import com.guchunhui.model.Book;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.ShoppingCarService;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gch on 16-6-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShoppingCarTest {

    @Autowired
    private ShoppingCarService shoppingCarService;

    @Test
    public void findShoppingCarById(){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(2);
        System.out.print(shoppingCar);
    }

    @Test
    public void insertShoppingCar(){
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setShoppingCarId(4);
        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    @Test
    public void deleteShoppingCarById(){
        shoppingCarService.deleteShoppingCarById(4);
    }

    @Test
    public void updateShoppingCar(){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(2);
        shoppingCar.setBooksIds("1;2;");
        shoppingCarService.updateShoppingCar(shoppingCar);
    }


}
