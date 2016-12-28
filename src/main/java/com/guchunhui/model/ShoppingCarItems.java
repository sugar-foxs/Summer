package com.guchunhui.model;

import java.io.Serializable;

/**
 * Created by gch on 16-12-13.
 */
public class ShoppingCarItems implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private long shoppingCarId;
    private Book book;
    private long bookId;
    private int quantity;

    public ShoppingCarItems() {
    }

    public ShoppingCarItems(long shoppingCarId, long bookId, int quantity) {
        this.shoppingCarId = shoppingCarId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(long shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingCarItems{" +
                "id=" + id +
                ", shoppingCarId=" + shoppingCarId +
                ", book=" + book +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                '}';
    }
}
