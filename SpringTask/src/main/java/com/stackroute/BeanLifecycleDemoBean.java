package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void customInit(){
        System.out.println("inside custom init method");
    }

    public void customDestroy(){
        System.out.println("inside custom destroy method");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destruction interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside initialisation interface");

    }


}
