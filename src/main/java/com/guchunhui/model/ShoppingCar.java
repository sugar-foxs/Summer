package com.guchunhui.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
public class ShoppingCar implements Serializable{
    private static final long serialVersionUID = 9999858983295L;
    private long shoppingCarId;
    private List<Book> books;
    private String booksIds;
    private Customer customer;

    public String getBooksIds() {
        return booksIds;
    }

    public void setBooksIds(String booksIds) {
        this.booksIds = booksIds;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(long shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
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
        return "ShoppingCar{" +
                "shoppingCarId=" + shoppingCarId +
                ", books=" + books +
                ", booksIds='" + booksIds + '\'' +
                ", customer=" + customer +
                '}';
    }



}
