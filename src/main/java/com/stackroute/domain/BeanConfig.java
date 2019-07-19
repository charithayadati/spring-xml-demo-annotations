package com.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig
{
    //Creating bean using annotation and calling the methods
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanlifecycle() {
        return new BeanLifecycleDemoBean();
    }


}
