package com.guchunhui.serviceImp;

import com.guchunhui.dao.ShoppingCarMapper;
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

    public ShoppingCar findCarByCustomerId(long id) {
        return shoppingCarMapper.findCarByCustomerId(id);
    }

    public void insertShoppingCar(ShoppingCar shoppingCar) {
        shoppingCarMapper.insertShoppingCar(shoppingCar);
    }

    public void deleteCarByCustomerId(long id) {
        shoppingCarMapper.deleteCarByCustomerId(id);
    }

}
