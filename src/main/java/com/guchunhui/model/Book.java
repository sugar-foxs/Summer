package com.guchunhui.model;

import java.io.Serializable;

/**
 * Created by gch on 16-5-9.
 */
public class Book  implements Serializable{
    private static final long serialVersionUID = 854276895268L;
    private int bookId;
    private double price;
    private String bookName;
    private String author;
    private String year;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                "price=" + price +
                ", bookName='" + bookName +'\''+
                ", author='" + author +'\''+
                ", year='" + year +'\''+
                '}';
    }
}
