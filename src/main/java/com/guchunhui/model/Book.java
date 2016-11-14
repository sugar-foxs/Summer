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
        return
                bookId +"|"+
                bookName +"|"+
                author +"|"+
                year +"|"+
                price +"|"+
                cover
                ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (fatherClass != book.fatherClass) return false;
        if (sonClass != book.sonClass) return false;
        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (year != null ? !year.equals(book.year) : book.year != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        return cover != null ? cover.equals(book.cover) : book.cover == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + fatherClass;
        result = 31 * result + sonClass;
        return result;
    }
}
