package com.guchunhui.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by gch on 16-6-10.
 */
public class ShoppingList implements Serializable{
    private static final long serialVersionUID = 565436536098L;

    private long shoppingListId;    //订单id
    private String shoppingListName;//订单名字
    private String mobile;          //联系方式
    private String address;         //送货地址
    private float totalPrice;       //总价
    private Date createTime;        //创建日期
    private String paymentWay;      //支付方式
    private String orderState;      //订单状态
    private String bookIds;
    private List<Book>  books;
    private Customer customer;      //所属顾客


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListName() {
        return shoppingListName;
    }

    public void setShoppingListName(String shoppingListName) {
        this.shoppingListName = shoppingListName;
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

    public String getBookIds() {
        return bookIds;
    }

    public void setBookIds(String bookIds) {
        this.bookIds = bookIds;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "shoppingListId=" + shoppingListId +
                ", shoppingListName='" + shoppingListName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", totalPrice=" + totalPrice +
                ", creatTime=" + createTime +
                ", paymentWay='" + paymentWay + '\'' +
                ", orderState='" + orderState + '\'' +
                ", bookIds='" + bookIds + '\'' +
                ", books=" + books +
                ", customer=" + customer +
                '}';
    }
}
