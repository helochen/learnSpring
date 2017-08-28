package org.chen.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
        User user = (User) bf.getBean("testBean");
        System.out.println(user.getUserName() + user.geteMail());
    }
}
