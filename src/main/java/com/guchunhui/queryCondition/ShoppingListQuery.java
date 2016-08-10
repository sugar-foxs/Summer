package com.guchunhui.queryCondition;

/**
 * Created by gch on 16-8-10.
 */
public class ShoppingListQuery {
    private long customerId;
    private String orderState;

    public ShoppingListQuery() {
    }

    public ShoppingListQuery(long customerId) {
        this.customerId = customerId;
    }

    public ShoppingListQuery(long customerId, String orderState) {
        this.customerId = customerId;
        this.orderState = orderState;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "ShoppingListQuery{" +
                "customerId=" + customerId +
                ", orderState='" + orderState + '\'' +
                '}';
    }
}
