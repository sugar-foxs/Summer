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
 * Created by gch on 16-7-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShoppingCarUtilTest {

    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;


    @Test
    public void addBookToCar(){
        shoppingCarUtilService.addBookIntoCar(3,6);
    }

    @Test
    public void deleteBookFromCar(){
        shoppingCarUtilService.deleteBookFromCar(1,1);
    }

    @Test
    public void deleteThisBookFromCar(){
        shoppingCarUtilService.deleteThisBookFromCar(4,1);
    }

    @Test
    public void findShoppingCarById(){
        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(3);
        System.out.print(shoppingCar);
    }

    @Test
    public void cleanShoppingCarById(){
        shoppingCarUtilService.cleanShoppingCarById(1);
    }


}
