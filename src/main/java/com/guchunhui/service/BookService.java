package com.guchunhui.service;

import com.guchunhui.model.Book;
import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
public interface BookService {
    public void insertBook(Book book);
    public Book findBookById(int id);
    public Book findBookByName(String name);
    public List<Book> findAllBooks();
    public void deleteBookById(int id);
    public void deleteBookByName(String name);
}
