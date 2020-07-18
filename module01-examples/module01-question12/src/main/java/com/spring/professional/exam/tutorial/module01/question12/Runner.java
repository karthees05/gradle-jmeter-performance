package com.spring.professional.exam.tutorial.module01.question12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        SpringBean bean = context.getBean(SpringBean.class);
        bean.printProperties();
    }
}