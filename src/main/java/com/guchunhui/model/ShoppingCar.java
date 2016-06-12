package com.guchunhui.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
public class ShoppingCar implements Serializable{
    private static final long serialVersionUID = 9999858983295L;
    private int shoppingCarId;
//    private int priceSum;
//    private int num;
    private List<Book> books;
    private String booksIds;

    public String getBooksIds() {
        return booksIds;
    }

    public void setBooksIds(String booksIds) {
        this.booksIds = booksIds;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(int shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

//    public int getPriceSum() {
//        return priceSum;
//    }
//
//    public void setPriceSum(int priceSum) {
//        this.priceSum = priceSum;
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "ShoppingCar{" +
                "shoppingCarId=" + shoppingCarId +
//                ", priceSum='" + priceSum  +
//                ", num='" + num +
                ", books='" + books +
                ", booksIds='" + booksIds+ '\'' +

                '}';
    }
}
