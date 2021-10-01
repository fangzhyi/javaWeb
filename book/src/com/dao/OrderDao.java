package com.dao;

import com.pojo.Order;

import java.util.List;

public interface OrderDao {
    public int saveOrder(Order order);

    public List<Order> queryMyOrders();

    public List<Order> queryAllOrders();

    public int changeOrderStatus();

}
