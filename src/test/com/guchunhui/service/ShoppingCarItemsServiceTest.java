package com.guchunhui.service;

import com.guchunhui.model.ShoppingCarItems;
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
public class ShoppingCarItemsServiceTest {
    @Autowired
    private ShoppingCarItemsService shoppingCarItemsService;
    @Test
    public void getShoppingCarItemsById() throws Exception {
        System.out.print(shoppingCarItemsService.getShoppingCarItemsById(1));
        System.out.print(shoppingCarItemsService.getShoppingCarItemsById(1));

    }

    @Test
    public void insert(){
        shoppingCarItemsService.insertCartItem(new ShoppingCarItems(1,2,1));
    }

    @Test
    public void deleteOne(){
        shoppingCarItemsService.deleteCarItemById(1,3);
    }

    @Test
    public void deleteAllItemsFromOneCar(){
        shoppingCarItemsService.deleteCarAllItems(1);
    }

    @Test
    public void updateQuantity(){
        shoppingCarItemsService.updateItem(2,3,5);
    }



}