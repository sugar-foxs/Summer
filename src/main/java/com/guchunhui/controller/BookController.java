package com.guchunhui.controller;

import com.guchunhui.model.Book;
import com.guchunhui.service.CustomerService;
import com.guchunhui.utils.BookUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xin on 16-9-27.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookUtilService bookUtilService;

    @ResponseBody
    @RequestMapping(value = "/findbook")
    public List<Book> findBookByClass(HttpServletRequest request){
        String fatherClass = request.getParameter("father");
        String son = request.getParameter("son");
        return bookUtilService.findKindBooks(Integer.parseInt(fatherClass),Integer.parseInt(son));
    }
    @ResponseBody
    @RequestMapping(value = "/findfather")
    public  List<Book> findBookByFather(HttpServletRequest request){
        String father=request.getParameter("father");
        return bookUtilService.findKindBooks(Integer.parseInt(father));
    }

    @ResponseBody
    @RequestMapping(value = "/findallbook")
    public List<Book> findAllBooks(){
        List<Book> bookList=bookUtilService.findAllBooks();
        return bookList;
    }

    @ResponseBody
    @RequestMapping(value = "/findbookbyid")
    public List<Book> findBookById(HttpServletRequest request)
    {
        String id=request.getParameter("bookid");
        List<Book> bookList = new LinkedList<Book>();
        Book book = bookUtilService.findBookById(Integer.parseInt(id));
        bookList.add(book);
        return bookList;
    }
}