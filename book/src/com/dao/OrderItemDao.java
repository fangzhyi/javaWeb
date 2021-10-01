package com.dao;

import com.pojo.Order;
import com.pojo.OrderItem;

import java.util.List;

public interface OrderItemDao {

    public int saveOrderItem(OrderItem orderItem);

    public List<Order> queryOrderDetailByOrderId(int id);
}
