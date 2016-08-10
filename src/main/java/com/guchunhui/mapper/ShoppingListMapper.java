package com.guchunhui.mapper;

import com.guchunhui.model.ShoppingList;
import com.guchunhui.queryCondition.ShoppingListQuery;

import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
public interface ShoppingListMapper {
    void insertShoppingList(ShoppingList shoppingList);
    List<ShoppingList> findAllShoppingListById(long customerId);
    List<ShoppingList> findShoppingListsByState(ShoppingListQuery shoppingListQuery);
    void deleteShoppingListById(long customerId);
}
