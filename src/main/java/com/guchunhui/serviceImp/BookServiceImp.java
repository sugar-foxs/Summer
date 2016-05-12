package com.guchunhui.serviceImp;

import com.guchunhui.mapper.BookMapper;
import com.guchunhui.model.Book;
import com.guchunhui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by gch on 16-5-9.
 */
@Service("bookService")
public class BookServiceImp implements BookService {

    private BookMapper bookMapper;

    @Autowired
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }
}
