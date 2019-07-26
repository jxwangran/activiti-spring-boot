package com.acitivi.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/** 
* @ClassName: DubboConfiguration 
* @Description: 
* @author wangran
* @date Jul 25, 2019 9:15:17 AM 
*/
@Configuration
public class DubboConfiguration implements ApplicationContextAware, BeanPostProcessor, BeanFactoryPostProcessor, EnvironmentAware {

	private ApplicationContext applicationContext;
	
//	private Map<String, ReferenceBean<?>> referenceParams = new ConcurrentHashMap<>(256);
	
	private Environment environment;
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		String packageName = this.environment.getProperty("dubbo.package");
		
//		
//		ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
//			@Override
//			public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
//
//				Reference reference = getAnnotation(field, Reference.class);
//
//				if (reference == null) {
//					return ;
//				}
//				
//				if (Modifier.isStatic(field.getModifiers())) {
//					return;
//				}
//				
//				if (!field.isAccessible()) {
//                    field.setAccessible(true);
//                }
//				
//				ReferenceBean<?> referenceBean = referenceParams.get(field.getType().getName());
//				
//				if (referenceBean != null) {
////					field.set(bean, referenceBean.get());
//					return ;
//				}
//		 
//				
//				referenceBean = new ReferenceBean<>(reference);
//				referenceBean.setInterface(field.getType());
//				referenceBean.setApplicationContext(applicationContext);
//				try {
//					referenceBean.afterPropertiesSet();
//					referenceParams.put(field.getType().getName(), referenceBean);
////					field.set(bean, referenceBean.get());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	}
	
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	
}
