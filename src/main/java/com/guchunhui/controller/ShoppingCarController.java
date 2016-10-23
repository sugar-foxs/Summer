package com.guchunhui.controller;

import com.guchunhui.model.Book;
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
public class ShoppingCarController {
    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;

    @ResponseBody
    @RequestMapping(value = "/findbooksinshoppingcar")
    public List<Book> findbooksinshoppingcar(HttpServletRequest request){
        String customerId=request.getParameter("customerId");
        return shoppingCarUtilService.findShoppingCarById(Integer.parseInt(customerId)).getBooks();
    }
}
