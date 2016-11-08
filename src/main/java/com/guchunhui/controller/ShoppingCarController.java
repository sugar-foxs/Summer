package com.guchunhui.controller;

import com.guchunhui.model.Book;
import com.guchunhui.model.Customer;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gch on 16-10-10.
 */
@Controller
@RequestMapping("/shopCart")
public class ShoppingCarController {
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;

    @ResponseBody
    @RequestMapping(value = "/findbooksinshoppingcar")
    public List<Book> findbooksinshoppingcar(HttpServletRequest request){
        String customerId=request.getParameter("customerId");
        return shoppingCarUtilService.findShoppingCarById(Integer.parseInt(customerId));
    }

    @RequestMapping(value = "/addBook")
    public void addBook(HttpServletRequest request, HttpSession session){
        String bookId = request.getParameter("bookId");
        String num = request.getParameter("num");
        Customer customer = (Customer) session.getAttribute("customer");
        if(bookId!=null && num!=null){
            shoppingCarUtilService.addBookIntoCar(Long.valueOf(bookId),Integer.valueOf(num),customer.getCustomerId());
        }
    }

    @ResponseBody
    @RequestMapping("/getAllBooks")
    public HashMap<Book,Long> getALlBooks(HttpSession session){
        Customer customer = (Customer) session.getAttribute("customer");
        HashMap<Book,Long> map = new HashMap<Book,Long>();
        List<Book> books = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId());
        for(Book book:books){
            map.put(book,map.get(book)==null?1:map.get(book)+1);
        }
        return map;
    }

    @RequestMapping("/tocar")
    public String toCar(){
        return "shoppingCar";
    }

}
