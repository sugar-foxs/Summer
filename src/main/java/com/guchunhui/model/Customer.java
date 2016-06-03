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

    private ShoppingCar shoppingCar;

    private int shoppingcarId;

    public int getShoppingcarId() {
        return shoppingcarId;
    }

    public void setShoppingcarId(int shoppingcarId) {
        this.shoppingcarId = shoppingcarId;
    }

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

    public ShoppingCar getShoppingCar() {
        return shoppingCar;
    }

    public void setShoppingCar(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }
}
