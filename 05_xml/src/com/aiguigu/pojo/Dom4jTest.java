package com.aiguigu.pojo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {
    @Test
    public void test1() throws Exception {
        // 创建一个SaxReader输入流，去读取 xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("src/books.xml");

        System.out.println(document);
    }
    @Test
    public void test2() throws Exception {
        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read("src/books.xml");
//      获取根元素
        Element rootElement = document.getRootElement();

//        System.out.println(rootElement);
        List<Element> books = rootElement.elements("book");

        for (Element book:books) {
//            asXML获取标签对象
//            System.out.println(book.asXML());
//          获取name元素
//            Element name = book.element("name");
//            System.out.println(name.getText());
            String name = book.elementText("name");
            String price = book.elementText("price");
            String author = book.elementText("author");

            String sn = book.attributeValue("id");
            System.out.println(new Book(sn,name,Double.parseDouble(price),author));
        }

    }
}
