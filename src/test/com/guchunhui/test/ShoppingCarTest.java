package com.guchunhui.test;

import com.guchunhui.model.Book;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.ShoppingCarService;
import com.guchunhui.utils.ShoppingCarUtilService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gch on 16-6-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ShoppingCarTest {
    private ShoppingCarService shoppingCarService;
    private ShoppingCarUtilService shoppingCarUtilService;

    @Autowired
    public void setShoppingCarUtilService(ShoppingCarUtilService shoppingCarUtilService) {
        this.shoppingCarUtilService = shoppingCarUtilService;
    }

    @Autowired
    public void setShoppingCarService(ShoppingCarService shoppingCarService) {
        this.shoppingCarService = shoppingCarService;
    }

    @Test
    public void findShoppingCarById(){
        ShoppingCar shoppingCar = shoppingCarUtilService.findShoppingCarById(3);
        List<Book> bookList = shoppingCar.getBooks();
        for(Book book : bookList){
            System.out.println(book.getBookName());
        }
    }

    @Test
    public void insertShoppingCar(){
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setShoppingCarId(2);
        shoppingCarService.insertShoppingCar(shoppingCar);
    }

    @Test
    public void deleteShoppingCarById(){
        shoppingCarService.deleteShoppingCarById(2);
    }

    @Test
    public void updateShoppingCar(){
        ShoppingCar shoppingCar = shoppingCarService.findShoppingCarById(2);
        shoppingCar.setBooksIds("1;");
        shoppingCarService.updateShoppingCar(shoppingCar);
    }


    @Test
    public void addbooktocar(){
        shoppingCarUtilService.addBookIntoCar(3,1);
    }

    @Test
    public void deleteBookFromCar(){
        shoppingCarUtilService.deleteBookFromCar(3,1);
    }
}
