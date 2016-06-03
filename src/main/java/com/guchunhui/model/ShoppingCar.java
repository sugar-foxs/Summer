package com.guchunhui.model;

import java.util.ArrayList;

/**
 * Created by gch on 16-5-9.
 */
public class ShoppingCar {
    int shoppingCarId;
    int priceSum;
    int num;

    public int getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(int shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public int getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(int priceSum) {
        this.priceSum = priceSum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    //    ArrayList<Commodity> commodities;
}
