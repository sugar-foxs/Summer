package com.guchunhui.utils;

import com.guchunhui.model.Book;
import com.guchunhui.model.ShoppingCar;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gch on 16-11-14.
 */
@Service("cookieUtilService")
public class CookieUtilService {

    /**
     * 判断是否含有key为s的cookie
     * @param request
     * @param s
     * @return
     */
    public boolean haveThisCookie(HttpServletRequest request, String s){
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return false;
        }else{
            for(Cookie cookie:cookies){
                if(cookie.getName().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 返回key为s的cookie
     * @param request
     * @param s
     * @return
     */
    public Cookie getCookie(HttpServletRequest request, String s){
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return null;
        }else{
            for(Cookie cookie:cookies){
                if(cookie.getName().equals(s)){
                    return cookie;
                }
            }
        }
        return null;
    }



    /**
     * 把购物车的商品变为cookie字符串
     * @param shoppingCar
     * @return
     */
    public String toCookieString(ShoppingCar shoppingCar){
        StringBuilder buffer = new StringBuilder();
        List<Book> books = shoppingCar.getBooks();
        HashMap<Book,Long> map = new HashMap<Book, Long>();
        for(Book book:books){

            map.put(book,map.containsKey(book)?map.get(book)+1:1);

        }
        for(Map.Entry<Book,Long> entry:map.entrySet()){
            buffer.append(entry.getKey().toCookieString());
            buffer.append(entry.getValue());
            buffer.append("#");
        }
        if (buffer.length() > 0)
            buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }

    /**
     * 删除cookie
     * @param cookie
     */
    public void delete(Cookie cookie){
        cookie.setMaxAge(0);
    }
}