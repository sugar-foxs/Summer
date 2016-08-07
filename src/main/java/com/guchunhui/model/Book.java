package com.guchunhui.model;

import java.io.Serializable;

/**
 * Created by gch on 16-5-9.
 */
public class Book  implements Serializable{
    private static final long serialVersionUID = 854276895268L;
    private long bookId;
    private String bookName;
    private String author;
    private String year;
    private double price;
    private String description;
    private String cover;
    private int fatherClass;
    private int sonClass;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getFatherClass() {
        return fatherClass;
    }

    public void setFatherClass(int fatherClass) {
        this.fatherClass = fatherClass;
    }

    public int getSonClass() {
        return sonClass;
    }

    public void setSonClass(int sonClass) {
        this.sonClass = sonClass;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", cover='" + cover + '\'' +
                ", fatherClass=" + fatherClass +
                ", sonClass=" + sonClass +
                '}';
    }
}
