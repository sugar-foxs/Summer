package com.guchunhui.utils;

import com.guchunhui.model.Book;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.BookService;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gch on 16-6-12.
 */
@Service("shoppingCArUtilService")
public class ShoppingCarUtilService {
    private ShoppingCarService shoppingCarService;
    private BookService bookService;

    @Autowired
    public void setShoppingCarService(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public ShoppingCar findShoppingCarById(int id){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(id);
        String booksIds = shoppingCar.getBooksIds();
        String[] booksIdsArr = booksIds.split(";");
        List<Book> bookList = new ArrayList<Book>();
        if(!booksIds.equals("")){
            for(String bookId : booksIdsArr){
                Book book = bookService.findBookById(Integer.valueOf(bookId));
                bookList.add(book);
            }
        }
        shoppingCar.setBooks(bookList);
        return shoppingCar;
    }
}
