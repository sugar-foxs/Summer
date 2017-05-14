package com.guchunhui.service;

import com.guchunhui.model.ShoppingCarItems;

import java.util.List;

/**
 * Created by gch on 16-12-13.
 */
public interface ShoppingCarItemsService {
    List<ShoppingCarItems> getShoppingCarItemsById(long shoppingCarId);
    ShoppingCarItems getShoppingCarItemsByTwoId(long shoppingCarId,long bookId);
    int insertCartItem(ShoppingCarItems shoppingCarItems);
    int deleteCarItemById(long shoppingCarId, long bookId);
    int deleteCarAllItems(long shoppingCarId);
    int updateItem(long shoppingCarId,long bookId,int quantity);

}
