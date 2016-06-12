package com.guchunhui.service;

import com.guchunhui.model.ShoppingCar;

/**
 * Created by gch on 16-6-2.
 */
public interface ShoppingCarService {
    public ShoppingCar findShoppingCarById(int id);
    public void insertShoppingCar(ShoppingCar shoppingCar);
    public void deleteShoppingCarById(int id);
    public void updateShoppingCar(ShoppingCar shoppingCar);

}
