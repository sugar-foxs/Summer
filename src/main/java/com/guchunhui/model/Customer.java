package com.guchunhui.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
public class Customer implements Serializable{


    private int customerId;

    private String customerName;

    private String customerPassword;

    private String customerPhone;

    private String customerEmail;

    private ShoppingCar shoppingCar;

    private int shoppingcarId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
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

    public int getShoppingcarId() {
        return shoppingcarId;
    }

    public void setShoppingcarId(int shoppingcarId) {
        this.shoppingcarId = shoppingcarId;
    }

    public ShoppingCar getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }
}
