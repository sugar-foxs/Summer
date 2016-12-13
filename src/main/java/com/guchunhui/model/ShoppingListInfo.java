package com.guchunhui.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by gch on 16-6-10.
 */
public class ShoppingListInfo implements Serializable{
    private static final long serialVersionUID = 565436536098L;

    private long id;
    private long shoppingListId;    //订单id
    private String name;//收货人姓名
    private String mobile;          //联系方式
    private String address;         //送货地址
    private float totalPrice;       //总价
    private Date createTime;        //创建日期
    private String paymentWay;      //支付方式
    private String orderState;      //订单状态
    private Date payTime;//付款时间
    private Date sendTime;//发货日期
    private Date successTime;//成交时间
    private ShoppingListItem shoppingListItem;
    private Customer customer;      //所属顾客

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public ShoppingListItem getShoppingListItem() {
        return shoppingListItem;
    }

    public void setShoppingListItem(ShoppingListItem shoppingListItem) {
        this.shoppingListItem = shoppingListItem;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }




    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "ShoppingListInfo{" +
                "id=" + id +
                ", shoppingListId=" + shoppingListId +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", totalPrice=" + totalPrice +
                ", createTime=" + createTime +
                ", paymentWay='" + paymentWay + '\'' +
                ", orderState='" + orderState + '\'' +
                ", payTime=" + payTime +
                ", sendTime=" + sendTime +
                ", successTime=" + successTime +
                ", shoppingListItem=" + shoppingListItem +
                ", customer=" + customer +
                '}';
    }
}
