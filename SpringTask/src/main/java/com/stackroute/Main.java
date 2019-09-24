package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String [] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Movie movie=context.getBean("movie",Movie.class);
        Actor actor= context.getBean("actor",Actor.class);

        Actor actor1= factory.getBean("actor",Actor.class);



        System.out.println("using appcontext " + actor.getGender());
        System.out.println("using appcontext " + actor.getAge());
        System.out.println("using appcontext " + actor.getName());

        System.out.println("using beanFactory " + actor1.getGender());
        System.out.println("using beanFactory " + actor1.getName());
        System.out.println("using beanFactory " + actor1.getAge());

    }


}
