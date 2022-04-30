package com.tang.mapper;

import com.tang.pojo.Books;
import com.tang.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService books = context.getBean("BookServiceImpl", BooksService.class);
        List<Books> list = books.selectBooks();
        for (Books books1 : list) {
            System.out.println(books1);
        }
    }
}

