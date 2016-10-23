package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingList;
import com.guchunhui.queryCondition.ShoppingListQuery;
import com.guchunhui.service.ShoppingListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShoppingListTest {

    @Autowired
    private ShoppingListService shoppingListService;

    @Test
    public void insertShoppingList(){
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.setShoppingListName("ghfgh");
        shoppingList.setBookIds("1;2;");
        shoppingList.setMobile("15751867658");
        shoppingList.setAddress("ffff");
        shoppingList.setOrderState("0");
        shoppingList.setCustomer(new Customer());
        shoppingList.setCreateTime(new Date());
        shoppingListService.insertShoppingList(shoppingList);
    }

    @Test
    public void findAllShoppingListById(){
        List<ShoppingList> shoppingLists =  shoppingListService.findAllShoppingListById(1);
        for(ShoppingList shoppingList : shoppingLists){
            System.out.println(shoppingList);
        }
    }

    @Test
    public void deleteShoppingListById(){
        shoppingListService.deleteShoppingListById(1);
    }

    @Test
    public void findShoppingListsByOrder(){
        List<ShoppingList> shoppingLists = shoppingListService.findShoppingListsByState(new ShoppingListQuery(1));
        for(ShoppingList shoppingList : shoppingLists){
            System.out.println(shoppingList);
        }
    }
}
