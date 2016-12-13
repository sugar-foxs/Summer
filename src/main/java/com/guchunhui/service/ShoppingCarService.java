package com.guchunhui.service;

import com.guchunhui.model.ShoppingCar;

/**
 * Created by gch on 16-6-2.
 */
public interface ShoppingCarService {
     ShoppingCar findCarByCustomerId(long id);
     void insertShoppingCar(ShoppingCar shoppingCar);
     void deleteCarByCustomerId(long id);

}
