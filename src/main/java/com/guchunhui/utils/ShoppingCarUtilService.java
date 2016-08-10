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

    /**
     *
     * @param customerId
     * @return
     */
    public ShoppingCar findShoppingCarById(long customerId){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(customerId);
        String booksIds = shoppingCar.getBooksIds();
        List<Book> bookList = null;
        if(!(booksIds == null || booksIds.equals(""))){
            String[] booksIdsArr = booksIds.split(";");
            bookList = new ArrayList<Book>();
            for(String bookId : booksIdsArr){
                Book book = bookService.findBookById(Integer.valueOf(bookId));
                bookList.add(book);
            }
        }
        shoppingCar.setBooks(bookList);
        return shoppingCar;
    }

    /**
     * 清空购物车
     * @param id
     */
    public void cleanShoppingCarById(long id){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(id);
        String booksIds = shoppingCar.getBooksIds();
        if(!booksIds.equals("")){
            shoppingCar.setBooksIds("");
            shoppingCarService.updateShoppingCar(shoppingCar);
        }
    }

    /**
     * 往购物车里增加商品
     * @param bookId
     * @param account,商品个数
     * @param customerId
     */
    public void addBookIntoCar(long bookId,int account,long customerId){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(customerId);
        String booksIds = shoppingCar.getBooksIds();
        if(booksIds == null || booksIds.equals("")){
            shoppingCar.setBooksIds(String.valueOf(bookId)+";");
        }else{
            String newBookIds = booksIds;
            for(int i=0;i<account;i++){
                newBookIds = newBookIds.concat(String.valueOf(bookId)+";");
            }
            shoppingCar.setBooksIds(newBookIds);
        }
        shoppingCarService.updateShoppingCar(shoppingCar);
    }

    /**
     * 删除购物车里的某个商品,删掉一个
     */
    public void deleteBookFromCar(long bookId , long customerId){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(customerId);
        String booksIds = shoppingCar.getBooksIds();
        if(!(booksIds == null || booksIds.equals(""))){
            int i = booksIds.indexOf(String.valueOf(bookId));
            if(i != -1){
                booksIds = booksIds.substring(0,i)+booksIds.substring(i+2);
                shoppingCar.setBooksIds(booksIds);
            }

        }
        shoppingCarService.updateShoppingCar(shoppingCar);
    }

    /**
     * 删除购物车里的某个商品,个数变为0
     */
    public void deleteThisBookFromCar(long bookId , long customerId){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(customerId);
        String booksIds = shoppingCar.getBooksIds();
        if(!(booksIds == null || booksIds.equals(""))){
            int i=0;
            while(i != -1){
                i = booksIds.indexOf(String.valueOf(bookId));
                if(i != -1)
                booksIds = booksIds.substring(0,i)+booksIds.substring(i+2);
            }
            shoppingCar.setBooksIds(booksIds);

        }
        shoppingCarService.updateShoppingCar(shoppingCar);
    }


}
