package com.guchunhui.test;

import com.guchunhui.model.Book;
import com.guchunhui.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        Book book = new Book("tomcat","gu","2015",80);
//        book.setCommodityId(2);
//        book.setName("hhhh");
//        book.setAuthor("gu");
//        book.setYear("2015");
//        book.setPrice(5);
        bookService.insertBook(book);
    }

}
