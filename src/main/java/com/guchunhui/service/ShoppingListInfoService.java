package com.guchunhui.service;

import com.guchunhui.model.ShoppingListInfo;
import com.guchunhui.queryCondition.ShoppingListQuery;

import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
public interface ShoppingListInfoService {
    void insertShoppingList(ShoppingListInfo shoppingListInfo);
    List<ShoppingListInfo> findAllShoppingListById(long customerId);
    List<ShoppingListInfo> findShoppingListsByState(ShoppingListQuery shoppingListQuery);
    void deleteShoppingListById(long customerId);
}
