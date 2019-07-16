package com.stackroute.domain;

import org.springframework.beans.BeansException;

public class BeanPostProcessorDemoBean implements org.springframework.beans.factory.config.BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("In postProcessBeforeInitialization method");
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("In postProcessAfterInitialization method");
        return null;
    }
}
