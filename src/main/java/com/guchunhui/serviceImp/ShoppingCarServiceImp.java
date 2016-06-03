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
    private ShoppingCarMapper shoppingCarMapper;

    @Autowired
    public void setShoppingCarMapper(ShoppingCarMapper shoppingCarMapper) {
        this.shoppingCarMapper = shoppingCarMapper;
    }

    public ShoppingCar findShoppingCarById(int id) {
        return shoppingCarMapper.findShoppingCarById(id);
    }
}
