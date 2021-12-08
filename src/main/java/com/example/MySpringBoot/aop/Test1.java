package com.example.MySpringBoot.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Test1 {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

       Library library = context.getBean("libraryBean", Library.class);
       library.getBook();

        context.close();
    }
}
