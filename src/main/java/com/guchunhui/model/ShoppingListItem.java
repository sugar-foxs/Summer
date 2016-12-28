package com.guchunhui.model;

import java.io.Serializable;

/**
 * Created by gch on 16-12-10.
 */
public class ShoppingListItem implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private long shoppingListId;    //订单id
    private long bookId;//bookId
    private Book book;
    private int quantity;//数量


    public ShoppingListItem() {
    }

    public ShoppingListItem(long shoppingListId, long bookId, int quantity) {
        this.shoppingListId = shoppingListId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingListItem{" +
                "id=" + id +
                ", shoppingListId=" + shoppingListId +
                ", bookId=" + bookId +
                ", book=" + book +
                ", quantity=" + quantity +
                '}';
    }
}
