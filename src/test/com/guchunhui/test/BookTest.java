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

    @Autowired
    private BookService bookService;

    @Test
    public void insertBook(){
        Book book = new Book();
        book.setBookName("fastjson");
        book.setAuthor("gu");
        book.setYear("2015");
        book.setPrice(8.2);
        book.setDescription("etre");
        book.setCover("gfg.jpg");
        book.setSpecies(1);
        bookService.insertBook(book);
    }

    @Test
    public void findBookById(){
        Book book = bookService.findBookById(2);
        System.out.println(book);
    }

    @Test
    public void findBookByName(){
        Book book = bookService.findBookByName("love");
        System.out.println(book);
    }

    @Test
    public void findAllBooks(){
        List<Book> books = bookService.findAllBooks();
        for(Book book : books){
            System.out.println(book);
        }
    }

    @Test
    public void deleteBookById(){
        bookService.deleteBookById(5);
    }

    @Test
    public void deleteBookByName(){
        bookService.deleteBookByName("fastjson");
    }
}
