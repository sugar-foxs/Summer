package com.guchunhui.test;

import com.guchunhui.model.Book;
import com.guchunhui.queryCondition.BookQuery;
import com.guchunhui.service.BookService;
import com.guchunhui.utils.BookUtilService;
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


    private BookUtilService bookUtilService;
    @Autowired
    public void setBookUtilService(BookUtilService bookUtilService) {
        this.bookUtilService = bookUtilService;
    }

    @Test
    public void insertBook(){
        for(int i=0;i<5;i++){
            Book book = new Book();
            book.setBookName("javascript");
            book.setAuthor("cxh");
            book.setYear("2012");
            book.setPrice(18.8);
            book.setDescription("etre");
            book.setCover("gfg.jpg");
            book.setFatherClass(2);
            book.setSonClass(1);
            bookService.insertBook(book);
        }

    }

    @Test
    public void findBookById(){
        Book book = bookService.findBookById(3);
        System.out.println(book);
    }

    @Test
    public void findBooksByName(){
        List<Book> books = bookService.findBooksByMessage("java");
        for(Book abook : books){
            System.out.println(abook);
            System.out.println(abook.getBookName());
        }
    }

    @Test
    public void findAllBooks(){
        List<Book> books = bookService.findAllBooks();
        for(Book book : books){
            System.out.println(book);
        }
    }

    @Test
    public void findBooksByClass(){
        List<Book> books = bookUtilService.findKindBooks(2,1);
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
        bookService.deleteBookByName("json");
    }
}
