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
    public void insertShoppingList(ShoppingList shoppingList) {
        shoppingListMapper.insertShoppingList(shoppingList);
    }

    public List<ShoppingList> findAllShoppingListById(long customerId) {
        return shoppingListMapper.findAllShoppingListById(customerId);
    }

    public List<ShoppingList> findShoppingListsByState(ShoppingListQuery shoppingListQuery) {
        return shoppingListMapper.findShoppingListsByState(shoppingListQuery);
    }


    public void deleteShoppingListById(long customerId) {
        shoppingListMapper.deleteShoppingListById(customerId);
    }
}
