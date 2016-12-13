package com.guchunhui.service;

import com.guchunhui.model.ShoppingListItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by gch on 16-12-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ShoppingListItemServiceTest {
    @Autowired
    private ShoppingListItemService shoppingListItemService;
    @Test
    public void getItems() throws Exception {
        List<ShoppingListItem> listItems = shoppingListItemService.getItems(1);
        System.out.print(listItems);
    }

    @Test
    public void insertItem() throws Exception {
        ShoppingListItem shoppingListItem = new ShoppingListItem(2,1,2);
        System.out.print(shoppingListItemService.insertItem(shoppingListItem));
    }

    @Test
    public void deleteItems(){
        shoppingListItemService.deleteItems(1);
    }

}