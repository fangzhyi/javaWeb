package com.dao.impl;

import com.dao.OrderDao;
import com.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {

    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }

    @Override
    public List<Order> queryMyOrders() {
        return null;
    }

    @Override
    public List<Order> queryAllOrders() {
        return null;
    }

    @Override
    public int changeOrderStatus() {
        return 0;
    }
}
