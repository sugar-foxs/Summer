package com.guchunhui.test;

import com.guchunhui.model.Book;
import com.guchunhui.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gch on 16-5-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class BookTest {
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Test
    public void insertBook(){
        Book book = new Book();
        book.setBookName("http");
        book.setAuthor("gu");
        book.setYear("2015");
        book.setPrice(8.2);
        bookService.insertBook(book);
    }

    @Test
    public void findBookById(){
        Book book = bookService.findBookById(4);
        System.out.println(
            book.getBookName()+" "+
            book.getAuthor()+" "+
            book.getYear()+" "+
            book.getPrice()
        );
    }

    @Test
    public void findBookByName(){
        Book book = bookService.findBookByName("java");
        System.out.println(
            book.getBookName()+" "+
            book.getAuthor()+" "+
            book.getYear()+" "+
            book.getPrice()
        );
    }

    @Test
    public void findAllBooks(){
        List<Book> books = bookService.findAllBooks();
        for(Book book : books){
            System.out.println(
                book.getBookName()+" "+
                book.getAuthor()+" "+
                book.getYear()+" "+
                book.getPrice()
            );
        }
    }

    @Test
    public void deleteBookById(){
        bookService.deleteBookById(2);
    }

    @Test
    public void deleteBookByName(){
        bookService.deleteBookByName("java");
    }
}
