package com.guchunhui.serviceImp;

import com.guchunhui.dao.ShoppingListInfoMapper;
import com.guchunhui.model.ShoppingListInfo;
import com.guchunhui.queryCondition.ShoppingListQuery;
import com.guchunhui.service.ShoppingListInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-8-10.
 */
@Service("shoppingListService")
public class ShoppingListInfoServiceImp implements ShoppingListInfoService {

    @Autowired
    private ShoppingListInfoMapper shoppingListInfoMapper;

    //提交订单
    public void insertShoppingList(ShoppingListInfo shoppingListInfo) {
        shoppingListInfoMapper.insertShoppingListInfo(shoppingListInfo);
    }

    //查询全部订单
    public List<ShoppingListInfo> findAllShoppingListById(long customerId) {
        return shoppingListInfoMapper.findAllShoppingListInfoById(customerId);
    }

    //根据订单状态查询,0:待付款  1：待发货  2：待收货 3:待评价（交易成功的）
    public List<ShoppingListInfo> findShoppingListsByState(ShoppingListQuery shoppingListQuery) {
        return shoppingListInfoMapper.findShoppingListsByState(shoppingListQuery);
    }


    //取消订单
    public void deleteShoppingListById(long customerId) {
        shoppingListInfoMapper.deleteShoppingListInfoById(customerId);
    }
}
