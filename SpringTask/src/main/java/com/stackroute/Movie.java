package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor1;
    private ApplicationContext context =null;
    private String beanName ;
    private BeanFactory beanFactory1;
    public Movie(Actor actor){
      //  System.out.println("movie object created");
        this.actor1=actor;
    }


    public void setActor1(Actor actor) {
        this.actor1 = actor;
    }

    public Actor getActor() {
        return actor1;
    }

    @Override
    public void setBeanName(String s) {
    this.beanName=s;
        System.out.println("BeanName" + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
        System.out.println("app context"+context);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory1=beanFactory;
        System.out.println("Bean Factory"+beanFactory1);
    }


}
