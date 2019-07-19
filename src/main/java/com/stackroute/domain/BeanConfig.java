package com.stackroute.domain;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig
{
    //Craeting beans using annotations
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifecycleDemoBean beanlifecycle() {
        return new BeanLifecycleDemoBean();
    }
    @Bean
    public BeanPostProcessorDemoBean beanpost() {
        return new BeanPostProcessorDemoBean();
    }

}
