package com.guchunhui.utils;

import com.guchunhui.model.Book;
import com.guchunhui.model.ShoppingCar;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

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
    public String toCookieString(ShoppingCar shoppingCar) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Book> books = shoppingCar.getBooks();
        return objectMapper.writeValueAsString(books);
    }

    /**
     * 删除cookie
     * @param cookie
     */
    public void delete(Cookie cookie){
        cookie.setMaxAge(0);
    }
}