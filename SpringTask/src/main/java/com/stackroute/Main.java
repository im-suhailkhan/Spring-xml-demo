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
        //BeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Movie beanA=context.getBean("movie",Movie.class);
        Movie beanB=context.getBean("movie",Movie.class);
        Actor actor= context.getBean("actor",Actor.class);

        //Actor actor1= factory.getBean("actor",Actor.class);

        System.out.println("using appcontext " + actor.getGender());
        System.out.println("using appcontext " + actor.getAge());
        System.out.println("using appcontext " + actor.getName());

        if(beanA == beanB)
            System.out.println("beanA is equal to beanB ");
        else
            System.out.println("bean A is not equal to bean B");




    }


}
© 2019 GitHub, Inc.