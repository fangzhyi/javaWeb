package com.web;

import com.google.gson.Gson;
import com.pojo.Book;
import com.pojo.Cart;
import com.pojo.CartItem;
import com.service.BookService;
import com.service.impl.BookServiceImpl;
import com.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CartServlet extends BaseServlet{
    private BookService bookService =new BookServiceImpl();

    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        int count = WebUtils.parseInt(req.getParameter("count"),1);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart != null){
            cart.updateCount(id,count);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }
    protected void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart  cart = (Cart) req.getSession().getAttribute("cart");
        if (cart != null){
            cart.clear();
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }
    protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"),0);
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        if(cart != null){
            cart.deleteItem(id);
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }
    protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("加入购物车");
//        System.out.println("商品编号"+req.getParameter("id"));
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Book book = bookService.queryBookById(id);
        CartItem cartItem = new CartItem(book.getId(),book.getName(),1,book.getPrice(),book.getPrice());
         Cart cart = (Cart) req.getSession().getAttribute("cart");
         if(cart == null){
             cart = new Cart();
             req.getSession().setAttribute("cart",cart);
         }
        cart.addItem(cartItem);
        System.out.println(cart);

        req.getSession().setAttribute("lastname",cartItem.getName());
//        System.out.println("请求头Referer的值"+req.getHeader("Referer"));
        //重定向回原来所在地址
        resp.sendRedirect(req.getHeader("Referer"));


    }
    protected void ajaxAddItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("加入购物车");
//        System.out.println("商品编号"+req.getParameter("id"));
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Book book = bookService.queryBookById(id);
        CartItem cartItem = new CartItem(book.getId(),book.getName(),1,book.getPrice(),book.getPrice());
         Cart cart = (Cart) req.getSession().getAttribute("cart");
         if(cart == null){
             cart = new Cart();
             req.getSession().setAttribute("cart",cart);
         }
        cart.addItem(cartItem);
        System.out.println(cart);

        req.getSession().setAttribute("lastname",cartItem.getName());

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("totalCount",cart.getTotalCount());
        resultMap.put("lastname",cartItem.getName());

        Gson gson = new Gson();
        String resultMapJsonString = gson.toJson(resultMap);
        resp.getWriter().write(resultMapJsonString);


    }
}
