/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.config;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/**
 * @ClassName: GroovyConfiguration
 * @Description:
 * @author wangran
 * @date Jul 8, 2019 3:53:27 PM
 */
@Configuration
public class GroovyConfiguration implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Bean("groovyBinding")
	public Binding groovyBinding() {
		Binding groovyBinding = new Binding();

		Map<String, Object> beanMap = applicationContext.getBeansWithAnnotation(Service.class);
		// 遍历设置所有bean,可以根据需求在循环中对bean做过滤
		for (String beanName : beanMap.keySet()) {
			groovyBinding.setVariable(beanName, beanMap.get(beanName));
		}
		return groovyBinding;
	}
	
	@ConditionalOnBean(value = Binding.class)
	@Bean("groovyShell")
	public GroovyShell groovyShell(Binding groovyBinding) {
		 GroovyShell groovyShell = new GroovyShell(groovyBinding);
		 return groovyShell;
	}

}
