package com.guchunhui.model;

/**
 * Created by gch on 16-5-9.
 */
public class Book extends Commodity {
    public String author;

    public String year;

    public Book() {
    }

    public Book(String name,String author, String year,int price) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
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
}
