/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import com.acitivi.po.AdminUserAuthPO;

/** 
* @ClassName: AutoBeanDefinitionRegistryPostProcessor 
* @Description: 
* @author wangran
* @date Jul 12, 2019 5:49:12 PM 
*/
public class AutoBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(AdminUserAuthPO.class, () -> new AdminUserAuthPO());
		BeanDefinition beanDefinition = builder.getRawBeanDefinition();
		
		AdminUserAuthPO admin = new AdminUserAuthPO();
		
		((DefaultListableBeanFactory) factory).registerBeanDefinition("adminUserAuthPO", beanDefinition);
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry arg0) throws BeansException {
		
	}

}
