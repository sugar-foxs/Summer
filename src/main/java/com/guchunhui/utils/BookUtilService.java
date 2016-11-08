package com.guchunhui.utils;

import com.guchunhui.model.Book;
import com.guchunhui.queryCondition.BookQuery;
import com.guchunhui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-8-7.
 */
@Service("bookUtilService")
public class BookUtilService {
    @Autowired
    private BookService bookService;

    /**
     *
     * @param father
     * @param son
     * @return
     */
    public List<Book> findKindBooks(int father,int son){
        BookQuery bookQuery = new BookQuery();
        bookQuery.setFather(father);
        bookQuery.setSon(son);
        return bookService.findBooksByClass(bookQuery);
    }

    public List<Book> findKindBooks(int father){
        BookQuery bookQuery = new BookQuery();
        bookQuery.setFather(father);
        return bookService.findBooksByClass(bookQuery);
    }
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    public Book findBookById(Integer id)
    {
        return bookService.findBookById(id);
    }

    public List<Book> findBookByMessage(String name)
    {
        return bookService.findBooksByMessage(name);
    }

    public List<Book> findBookByClass(BookQuery bookQuery)
    {
        return bookService.findBooksByClass(bookQuery);
    }

    public void deleteBookByName(String name) {
        bookService.deleteBookByName(name);
    }

    public void deleteBookById(long id) {
        bookService.deleteBookById(id);
    }
    public void insertBook(Book book)
    {
        bookService.insertBook(book);
    }

}
