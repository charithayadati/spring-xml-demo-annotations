package com.stackroute;
import com.stackroute.domain.BeanConfig;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        //Using ApplicationContext
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        BeanLifecycleDemoBean bean=context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        BeanPostProcessorDemoBean beanpost=context.getBean("beanpost",BeanPostProcessorDemoBean.class);
        context.close();
    }
}
