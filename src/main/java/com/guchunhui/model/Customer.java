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

//    private List<MultipartFile> images;
//
//    public List<MultipartFile> getImages() {
//        return images;
//    }
//
//    public void setImages(List<MultipartFile> images) {
//        this.images = images;
//    }

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
}
