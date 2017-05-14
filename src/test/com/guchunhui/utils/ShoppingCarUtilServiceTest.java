package com.guchunhui.test;

import com.guchunhui.utils.ShoppingCarUtilService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gch on 16-7-21.
 */
@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ShoppingCarUtilTest {

    @Autowired
    private ShoppingCarUtilService shoppingCarUtilService;


//    @Test
//    public void addBookToCar(){
//        shoppingCarUtilService.addBookIntoCar(1,2,1);
//    }
//
//    @Test
//    public void deleteBookFromCar(){
//        shoppingCarUtilService.deleteBookFromCar(2,2);
//    }
//
//    @Test
//    public void deleteThisBookFromCar(){
//        shoppingCarUtilService.deleteThisBookFromCar(2,1);
//    }
//
//    @Test
//    public void findShoppingCarById(){
//        List<Book> bookList = shoppingCarUtilService.findShoppingCarById(4).getBooks();
//        System.out.print(bookList);
//    }
//
//    @Test
//    public void cleanShoppingCarById(){
//        shoppingCarUtilService.cleanShoppingCarById(1);
//    }
//

}
