package com.guchunhui.service;

import com.guchunhui.model.Book;
import java.util.List;

/**
 * Created by gch on 16-5-9.
 */
public interface BookService {
     void insertBook(Book book);
     Book findBookById(long id);
     Book findBookByName(String name);
     List<Book> findAllBooks();
     void deleteBookById(long id);
     void deleteBookByName(String name);
}
