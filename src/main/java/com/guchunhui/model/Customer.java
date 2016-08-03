package com.guchunhui.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

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

//    private long shoppingCarId;         //购物车号

//    private long shoppingListId;        //购物清单号

    private ShoppingCar shoppingCar;   //购物车

    private ShoppingList shoppingList; //购物清单

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

//    public long getShoppingCarId() {
//        return shoppingCarId;
//    }
//
//    public void setShoppingCarId(long shoppingCarId) {
//        this.shoppingCarId = shoppingCarId;
//    }
//
//    public long getShoppingListId() {
//        return shoppingListId;
//    }
//
//    public void setShoppingListId(long shoppingListId) {
//        this.shoppingListId = shoppingListId;
//    }

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
                ", shoppingCar=" + shoppingCar +
                ", shoppingList=" + shoppingList +
                '}';
    }

}
