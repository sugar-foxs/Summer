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
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShoppingCarTest {
    private ShoppingCarService shoppingCarService;

    @Autowired
    public void setShoppingCarService(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    @Test
    public void findAllShoppingCarById(){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(1);
        System.out.println(shoppingCar.getShoppingCarId()+" "+shoppingCar.getPriceSum()+" "+shoppingCar.getNum());
    }
}
