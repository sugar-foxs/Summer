package com.guchunhui.model;

/**
 * Created by gch on 16-7-16.
 */
public class CustomerCarAndList {
    private long customerId;

    private long shoppingCarId;         //购物车号

    private long shoppingListId;        //购物清单号

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(long shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public long getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    @Override
    public String toString() {
        return "CustomerCarAndList{" +
                "customerId=" + customerId +
                ", shoppingCarId=" + shoppingCarId +
                ", shoppingListId=" + shoppingListId +
                '}';
    }
}
