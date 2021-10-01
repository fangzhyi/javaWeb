package com.test;

import com.dao.BookDao;
import com.dao.impl.BookDaoImpl;
import com.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"joker","fang",new BigDecimal(999),11111111,0,null));

    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void updateBook() {

        bookDao.updateBook(new Book(21,"joker","zhi",new BigDecimal(999),11111111,0,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
        for(Book queryBooks : bookDao.queryBooks()){
            System.out.println(queryBooks);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        for (Book queryForPageItem : bookDao.queryForPageItems(8, 4)) {
            System.out.println(queryForPageItem);
        }
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(10,50));
    }

    @Test
    public void queryForPageItemsByPrice() {
        for (Book queryForPageItem : bookDao.queryForPageItemsByPrice(0,4,10, 50)) {
            System.out.println(queryForPageItem);
        }
    }
}