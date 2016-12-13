package com.guchunhui.mapper;

import com.guchunhui.model.ShoppingListInfo;
import com.guchunhui.queryCondition.ShoppingListQuery;

import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
public interface ShoppingListInfoMapper {
    void insertShoppingListInfo(ShoppingListInfo shoppingListInfo);
    List<ShoppingListInfo> findAllShoppingListInfoById(long customerId);
    List<ShoppingListInfo> findShoppingListsByState(ShoppingListQuery shoppingListQuery);
    void deleteShoppingListInfoById(long customerId);
}
