package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String [] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        //BeanFactory factory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        ((AbstractApplicationContext)context).registerShutdownHook();
        //Movie beanA=context.getBean("movie",Movie.class);
        Movie movie=context.getBean("movie",Movie.class);
        //Actor actor= context.getBean("actor",Actor.class);

        //Actor actor1= factory.getBean("actor",Actor.class);

        System.out.println("using app context " + movie.getActorDetails().getGender());
        System.out.println("using app context " + movie.getActorDetails().getName());
        System.out.println("using app context " + movie.getActorDetails().getAge());

        // if(beanA == beanB)
        //System.out.println("beanA is equal to beanB ");
        //else
        //  System.out.println("bean A is not equal to bean B");




    }


}
