package com.guchunhui.controller;

import com.guchunhui.model.*;
import com.guchunhui.service.ShoppingCarService;
import com.guchunhui.utils.CookieUtilService;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gch on 16-10-10.
 */
@Controller
@RequestMapping("/shopCart")
public class ShoppingCarController {
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;
    @Autowired
    private ShoppingCarService shoppingCarService;

    @Autowired
    private CookieUtilService cookieUtilService;

    @ResponseBody
    @RequestMapping(value = "/findbooksinshoppingcar")
    public List<ShoppingCarItems> findbooksinshoppingcar(HttpServletRequest request){
        String customerId=request.getParameter("customerId");
        return shoppingCarUtilService.getItemsFromCarByCustomerId(Integer.parseInt(customerId));
    }

    @ResponseBody
    @RequestMapping(value = "/addBook")
    public String addBook(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws IOException {
        String bookId = request.getParameter("bookId");
        String num = request.getParameter("num");
        Customer customer = (Customer) session.getAttribute("customer");
        if( bookId!=null &&!bookId.equals("")&& num!=null&&!num.equals("")){
            long shoppingCarId = shoppingCarService.findCarByCustomerId(customer.getCustomerId()).getShoppingCarId();
            shoppingCarUtilService.addBookIntoCar(shoppingCarId,Long.valueOf(bookId),Integer.valueOf(num));
        }
        ShoppingCar shoppingCar = shoppingCarService.findCarByCustomerId(customer.getCustomerId());
        String cookieValue = URLEncoder.encode(cookieUtilService.toCookieString(shoppingCar),"utf-8");
        Cookie cookie = new Cookie(customer.getCustomerName()+"_cart", cookieValue);
        cookie.setMaxAge(7*24*60*60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "succeed";
    }

    @ResponseBody
    @RequestMapping("/getAllBooks")
    public List<ShoppingCarItems> getAllBooks(HttpSession session){
        Customer customer = (Customer) session.getAttribute("customer");
        List<ShoppingCarItems> shoppingCarItemsList = shoppingCarUtilService.getItemsFromCarByCustomerId(customer.getCustomerId());
        return shoppingCarItemsList;
    }



    @RequestMapping("/tocar")
    public String toCar(){
        return "shoppingCar";
    }

}
