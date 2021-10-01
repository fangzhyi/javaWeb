package com.test;

import com.dao.OrderItemDao;
import com.dao.impl.OrderItemDaoImpl;
import com.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderItemDaoTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null,"java从入门到放弃",1,new BigDecimal(100),new BigDecimal(100),"1233"));
        orderItemDao.saveOrderItem(new OrderItem(null,"JavaScript从入门到精通",2,new BigDecimal(100),new BigDecimal(200),"1233"));
        orderItemDao.saveOrderItem(new OrderItem(null,"操作系统原理",1,new BigDecimal(50),new BigDecimal(50),"1233"));

    }
}