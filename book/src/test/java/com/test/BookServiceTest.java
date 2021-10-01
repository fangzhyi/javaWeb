package com.test;

import com.pojo.Book;
import com.service.BookService;
import com.service.impl.BookServiceImpl;
import com.web.BaseServlet;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceTest {

    private BookService bookService = new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"joker","fang",new BigDecimal(999),11111111,0,null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22,"joker","zhi",new BigDecimal(999),11111111,0,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById( 22));

    }

    @Test
    public void queryBooks() {
        for (Book queryBooks :bookService.queryBooks()){
            System.out.println(queryBooks);
        }

    }

    @Test
    public void page(){
        System.out.println(bookService.page(1,4));
    }
    @Test
    public void pageByPrice(){
        System.out.println(bookService.pageByPrice(1,4,10,50));
    }
}