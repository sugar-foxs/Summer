package com.guchunhui.controller;

import com.guchunhui.model.ShoppingCarItems;
import com.guchunhui.utils.CookieUtilService;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    private CookieUtilService cookieUtilService;

    @ResponseBody
    @RequestMapping(value = "/findbooksinshoppingcar")
    public List<ShoppingCarItems> findbooksinshoppingcar(HttpServletRequest request){
        String customerId=request.getParameter("customerId");
        return shoppingCarUtilService.getItemsFromCarByCustomerId(Integer.parseInt(customerId));
    }
//
//    @ResponseBody
//    @RequestMapping(value = "/addBook")
//    public String addBook(HttpServletRequest request, HttpSession session,HttpServletResponse response) throws IOException {
//        String bookId = request.getParameter("bookId");
//        String num = request.getParameter("num");
//        Customer customer = (Customer) session.getAttribute("customer");
//        if(bookId!=null && num!=null){
//            shoppingCarUtilService.addBookIntoCar(Long.valueOf(bookId),Integer.valueOf(num),customer.getCustomerId());
//        }
//        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId());
//        String cookieValue = URLEncoder.encode(cookieUtilService.toCookieString(shoppingCar),"utf-8");
//        Cookie cookie = new Cookie(customer.getCustomerName()+"_cart", cookieValue);
//        cookie.setMaxAge(7*24*60*60);
//        cookie.setPath("/");
//        response.addCookie(cookie);
//        return "succeed";
//    }

//    @ResponseBody
//    @RequestMapping("/getAllBooks")
//    public HashMap<Book,Long> getALlBooks(HttpSession session){
//        Customer customer = (Customer) session.getAttribute("customer");
//        HashMap<Book,Long> map = new HashMap<Book,Long>();
//        List<Book> books = shoppingCarUtilService.findShoppingCarById(customer.getCustomerId()).getBooks();
//        for(Book book:books){
//            map.put(book,map.get(book)==null?1:map.get(book)+1);
//        }
//        return map;
//    }



    @RequestMapping("/tocar")
    public String toCar(){
        return "shoppingCar";
    }

}
