package com.guchunhui.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
public class ShoppingCar implements Serializable{
    private static final long serialVersionUID = 9999858983295L;
    private long shoppingCarId;
    private long customerId;//所属顾客
    private List<ShoppingCarItems> shoppingCarItemsList;//书的种类链表,不重复


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(long shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public List<ShoppingCarItems> getShoppingCarItemsList() {
        return shoppingCarItemsList;
    }

    public void setShoppingCarItemsList(List<ShoppingCarItems> shoppingCarItemsList) {
        this.shoppingCarItemsList = shoppingCarItemsList;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "shoppingCarId=" + shoppingCarId +
                ", customerId=" + customerId +
                ", shoppingCarItemsList=" + shoppingCarItemsList +
                '}';
    }
}
