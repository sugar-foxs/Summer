package com.guchunhui.test;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingListInfo;
import com.guchunhui.queryCondition.ShoppingListQuery;
import com.guchunhui.service.ShoppingListInfoService;
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
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ShoppingListInfoTest {

    @Autowired
    private ShoppingListInfoService shoppingListInfoService;

    @Test
    public void createShoppingList(){
        ShoppingListInfo shoppingListInfo = new ShoppingListInfo();
        shoppingListInfo.setName("guchunhui");
        shoppingListInfo.setMobile("15751867658");
        shoppingListInfo.setAddress("江苏省南京市");
        shoppingListInfo.setOrderState("0");
        shoppingListInfo.setPaymentWay("0");
        shoppingListInfo.setCustomer(new Customer());
        shoppingListInfo.setCreateTime(new Date());
        shoppingListInfoService.insertShoppingList(shoppingListInfo);
    }

    @Test
    public void findAllShoppingListById(){
        List<ShoppingListInfo> shoppingListInfos =  shoppingListInfoService.findAllShoppingListById(1);
        for(ShoppingListInfo shoppingListInfo : shoppingListInfos){
            System.out.println(shoppingListInfo);
        }
    }

    @Test
    public void deleteShoppingListById(){
        shoppingListInfoService.deleteShoppingListById(1);
    }

    @Test
    public void findShoppingListsByOrder(){
        List<ShoppingListInfo> shoppingListInfos = shoppingListInfoService.findShoppingListsByState(new ShoppingListQuery(1));
        for(ShoppingListInfo shoppingListInfo : shoppingListInfos){
            System.out.println(shoppingListInfo);
        }
    }
}
