package com.stackroute.domain;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


    public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean{


        @Override
        public void afterPropertiesSet() throws Exception
        {
            System.out.println("Bean Intializing");
        }
        @Override
        public void destroy() throws Exception
        {
            System.out.println("Bean Destroying");

        }

        public void customInit()
        {
            System.out.println("Initialization using custom-init");
        }

        public void customDestroy()
        {
            System.out.println("Destroying using custom-destroy");
        }
    }

