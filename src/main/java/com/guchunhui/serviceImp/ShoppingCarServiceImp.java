package com.guchunhui.serviceImp;

import com.guchunhui.mapper.ShoppingCarMapper;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gch on 16-6-2.
 */
@Service("shoppingCarService")
public class ShoppingCarServiceImp implements ShoppingCarService {

    @Autowired
    private ShoppingCarMapper shoppingCarMapper;

    public ShoppingCar findShoppingCarById(long id) {
        return shoppingCarMapper.findShoppingCarById(id);
    }

    public void insertShoppingCar(ShoppingCar shoppingCar) {
        shoppingCarMapper.insertShoppingCar(shoppingCar);
    }

    public void deleteShoppingCarById(long id) {
        shoppingCarMapper.deleteShoppingCarById(id);
    }

    public void updateShoppingCar(ShoppingCar shoppingCar) {
        shoppingCarMapper.updateShoppingCar(shoppingCar);
    }
}
