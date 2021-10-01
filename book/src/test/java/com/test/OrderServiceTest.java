package com.test;

import com.pojo.Cart;
import com.pojo.CartItem;
import com.service.OrderService;
import com.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void createOrder() {
        Cart cart = new Cart();
        cart.addItem(new CartItem(1,"java从入门到精通",1,new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(1,"java从入门到精通",1,new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(2,"java从精通到入门",1,new BigDecimal(1200),new BigDecimal(1200)));
        OrderService orderService = new OrderServiceImpl();
        System.out.println("订单号是："+orderService.createOrder(cart,1));
    }
}