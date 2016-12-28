package com.guchunhui.serviceImp;

import com.guchunhui.dao.ShoppingCarItemsMapper;
import com.guchunhui.model.ShoppingCarItems;
import com.guchunhui.service.ShoppingCarItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-12-13.
 */
@Service
public class ShoppingCarItemsServiceImp implements ShoppingCarItemsService {
    @Autowired
    private ShoppingCarItemsMapper shoppingCarItemsMapper;
    public List<ShoppingCarItems> getShoppingCarItemsById(long id) {
        return shoppingCarItemsMapper.getShoppingCarItemsById(id);
    }

    public ShoppingCarItems getShoppingCarItemsByTwoId(long shoppingCarId, long bookId) {
        return shoppingCarItemsMapper.getShoppingCarItemsByTwoId(shoppingCarId,bookId);
    }

    public int insertCartItem(ShoppingCarItems shoppingCarItems) {
        return shoppingCarItemsMapper.insertCartItem(shoppingCarItems);
    }


    public int deleteCarItemById(long shoppingCarId, long bookId) {
        return shoppingCarItemsMapper.deleteCarItemById(shoppingCarId,bookId);
    }

    public int deleteCarAllItems(long shoppingCarId) {
        return shoppingCarItemsMapper.deleteCarAllItems(shoppingCarId);
    }

    public int updateItem(long shoppingCarId, long bookId, int quantity) {
        return shoppingCarItemsMapper.updateItem(shoppingCarId,bookId,quantity);
    }


}
