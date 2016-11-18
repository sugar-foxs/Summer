package com.guchunhui.controller;

import com.github.pagehelper.PageHelper;
import com.guchunhui.model.Book;
import com.guchunhui.service.BookService;
import com.guchunhui.service.CustomerService;
import com.guchunhui.utils.BookUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xin on 16-9-27.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookUtilService bookUtilService;

    @ResponseBody
    @RequestMapping(value = "/findall")
    public List<Book> findAllBooks(HttpServletRequest request){
        String page = request.getParameter("page");
        PageHelper.startPage(Integer.parseInt(page),20,true,false);
        return bookService.findAllBooks();
    }

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
    @RequestMapping(value = "/findsuccess")
    public List<Book> findsuccbook(HttpServletRequest request){
        String fatherclass = request.getParameter("father");
        List<Book> bookList = bookUtilService.findKindBooks(Integer.parseInt(fatherclass));
        return bookList;
    }

    @RequestMapping(value = "/{bookId}")
    public String getOneBook(@PathVariable String bookId,Model model){
        Book book = bookService.findBookById(Long.parseLong(bookId));
        model.addAttribute(book);
        return "DisplayBook";
    }


}
