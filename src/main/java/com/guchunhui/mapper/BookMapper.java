package com.guchunhui.mapper;

import com.guchunhui.model.Book;

import java.util.List;

/**
 * Created by gch on 16-5-12.
 */
public interface BookMapper {
    public void insertBook(Book book);
    public Book findBookById(int id);
    public Book findBookByName(String name);
    public List<Book> findAllBooks();
    public void deleteBookById(int id);
    public void deleteBookByName(String name);

}
