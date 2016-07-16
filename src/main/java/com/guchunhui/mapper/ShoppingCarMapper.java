package com.guchunhui.mapper;

import com.guchunhui.model.ShoppingCar;

/**
 * Created by gch on 16-6-2.
 */
public interface ShoppingCarMapper {
     ShoppingCar findShoppingCarById(long id);
     void insertShoppingCar(ShoppingCar shoppingCar);
     void deleteShoppingCarById(long id);
     void updateShoppingCar(ShoppingCar shoppingCar);

}
