package com.guchunhui.serviceImp;

import com.guchunhui.mapper.ShoppingListMapper;
import com.guchunhui.model.ShoppingList;
import com.guchunhui.queryCondition.ShoppingListQuery;
import com.guchunhui.service.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
@Service("shoppingListService")
public class ShoppingListServiceImp implements ShoppingListService{

    @Autowired
    private ShoppingListMapper shoppingListMapper;

    //提交订单
    public void insertShoppingList(ShoppingList shoppingList) {
        shoppingListMapper.insertShoppingList(shoppingList);
    }

    //查询全部订单
    public List<ShoppingList> findAllShoppingListById(long customerId) {
        return shoppingListMapper.findAllShoppingListById(customerId);
    }

    //根据订单状态查询,0:待付款  1：待发货  2：待收货 3:待评价（交易成功的）
    public List<ShoppingList> findShoppingListsByState(ShoppingListQuery shoppingListQuery) {
        return shoppingListMapper.findShoppingListsByState(shoppingListQuery);
    }


    //取消订单
    public void deleteShoppingListById(long customerId) {
        shoppingListMapper.deleteShoppingListById(customerId);
    }
}
