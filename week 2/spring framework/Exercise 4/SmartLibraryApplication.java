package com.smartlibrary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smartlibrary.service.BookService;

public class SmartLibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                (BookService) context.getBean("bookService");

        service.displayService();

    }

}