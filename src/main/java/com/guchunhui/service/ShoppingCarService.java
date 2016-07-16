package com.guchunhui.service;

import com.guchunhui.model.ShoppingCar;

/**
 * Created by gch on 16-6-2.
 */
public interface ShoppingCarService {
     ShoppingCar findShoppingCarById(long id);
     void insertShoppingCar(ShoppingCar shoppingCar);
     void deleteShoppingCarById(long id);
     void updateShoppingCar(ShoppingCar shoppingCar);

}
