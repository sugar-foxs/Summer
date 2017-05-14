package com.guchunhui.dao;

import com.guchunhui.model.ShoppingCar;

/**
 * Created by gch on 16-6-2.
 */
public interface ShoppingCarMapper {
     ShoppingCar findCarByCustomerId(long id);
     void insertShoppingCar(ShoppingCar shoppingCar);
     void deleteCarByCustomerId(long id);

}
