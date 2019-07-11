package com.acitivi.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextUtils implements ApplicationContextAware {

    static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        SpringContextUtils.context = context;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    public static void autowireBean(Object bean) {
        context.getAutowireCapableBeanFactory().autowireBean(bean);
    }

    public static <T> T getBean(Class<T> clazz) {
        return context.getBean(clazz);
    }
    
    public static <T> T registerBean(String name, Class<T> clazz) {
    	ConfigurableApplicationContext context = (ConfigurableApplicationContext) SpringContextUtils.context;
    	
    	BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
    	BeanDefinition definition = builder.getRawBeanDefinition();
    	BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();
    	beanFactory.registerBeanDefinition(name, definition);
    	
    	return context.getBean(name, clazz);
    }

}