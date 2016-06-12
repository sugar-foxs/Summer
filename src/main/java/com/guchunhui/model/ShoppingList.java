package com.guchunhui.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gch on 16-6-10.
 */
public class ShoppingList implements Serializable{
    private static final long serialVersionUID = 565436536098L;

    private Long shoppingListId;
    private List<Book> books;
    private String booksIds;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(Long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getBooksIds() {
        return booksIds;
    }

    public void setBooksIds(String booksIds) {
        this.booksIds = booksIds;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "shoppingListId=" + shoppingListId +
                ", books='" + books +
                ", booksIds='" + booksIds +'\'' +
                '}';
    }
}
