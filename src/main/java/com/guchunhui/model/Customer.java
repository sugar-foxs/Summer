package com.guchunhui.model;

import java.io.Serializable;

/**
 * Created by gch on 16-4-13.
 */
public class Customer implements Serializable{

    private static final long serialVersionUID = 75892437892L;

    private long customerId;         //唯一id号

    private String customerName;    //消费者姓名

    private String customerPassword; //密码

    private String customerPhone;     //手机号

    private String customerEmail;     //邮箱

    private String customerAddress;   //地址

    private ShoppingCar shoppingCar;//购物车

    public Customer() {
    }

    public Customer(String customerName, String customerPassword, String customerPhone, String customerEmail, String customerAddress) {
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Customer(long customerId) {
        this.customerId = customerId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public ShoppingCar getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", shoppingCar=" + shoppingCar +
                '}';
    }
}
