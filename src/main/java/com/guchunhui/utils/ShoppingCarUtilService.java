package com.guchunhui.utils;

import com.guchunhui.model.ShoppingCar;
import com.guchunhui.model.ShoppingCarItems;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-6-12.
 */
@Service("shoppingCarUtilService")
public class ShoppingCarUtilService {


    @Autowired
    private ShoppingCarItemsService shoppingCarItemsService;


    @Autowired
    private CustomerService customerService;

    /**
     *从数据库中找出商品，及每种商品的数量
     * @param customerId
     * @return
     */
    public List<ShoppingCarItems> getItemsFromCarByCustomerId(long customerId){
        ShoppingCar shoppingCar = customerService.findCustomerById(customerId).getShoppingCar();
        return shoppingCar.getShoppingCarItemsList();
    }

    /**
     * 清空购物车
     * @param shoppingCarId
     */
    public void cleanShoppingCarById(long shoppingCarId){
        shoppingCarItemsService.deleteCarAllItems(shoppingCarId);
    }

    /**
     * 往购物车里增加商品,或更新已有商品的数目
     * @param shoppingCarId
     * @param bookId
     * @param quantity
     */
    public void addBookIntoCar(long shoppingCarId,long bookId,int quantity){
        ShoppingCarItems shoppingCarItems = shoppingCarItemsService.getShoppingCarItemsByTwoId(shoppingCarId,bookId);
        if(shoppingCarItems!=null){
            shoppingCarItemsService.updateItem(shoppingCarId,bookId,quantity);
        }else{
            shoppingCarItemsService.insertCartItem(new ShoppingCarItems(shoppingCarId,bookId,quantity));
        }
    }


    /**
     * 删除购物车里的某个商品
     * @param shoppingCarId
     * @param bookId
     */
    public void deleteThisBookFromCar(long shoppingCarId,long bookId){
        shoppingCarItemsService.deleteCarItemById(shoppingCarId,bookId);
    }







}
