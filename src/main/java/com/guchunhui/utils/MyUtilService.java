package com.guchunhui.utils;

import com.guchunhui.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gch on 16-11-15.
 */
@Service("myUtilService")
public class MyUtilService {
    public Map<Book,Long> checkDuplicate(List<Book> bookList){
        Map<Book,Long> map = new HashMap<Book,Long>();
        if(bookList!=null){
            for(Book book : bookList){
                map.put(book,map.containsKey(book)?map.get(book)+1:1);
            }
        }
        return map;
    }
}
