package com.guchunhui.dao;

import com.guchunhui.model.Book;
import com.guchunhui.queryCondition.BookQuery;

import java.util.List;

/**
 * Created by gch on 16-5-12.
 */
public interface BookMapper {
     void insertBook(Book book);
     Book findBookById(long id);
     List<Book> findBooksByMessage(String name);

     List<Book> findAllBooks();
     List<Book> findBooksByClass(BookQuery bookQuery);
     void deleteBookById(long id);
     void deleteBookByName(String name);

}
