package com.learnspring.destroy_prototype_scope_bean_with_custom_processor;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

	private BeanFactory beanFactory;
	
	private final List<Object> prototypeBeans = new LinkedList<>();
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// After startup, we need to keep track of the prototyped beans
		// We will need to know who are they for destruction
		
		if(beanFactory.isPrototype(beanName)) {
			System.out.println(beanName);
			synchronized (prototypeBeans) {
				prototypeBeans.add(bean);
			}
		}
		
		return bean;
	}
	
	@Override
	public void destroy() throws Exception {
		// loop through each prototypeBean and call destroy() on each bean
		synchronized (prototypeBeans) {
			for(Object bean : prototypeBeans) {
				if (bean instanceof DisposableBean) {
					DisposableBean disposableBean = (DisposableBean)bean;
					try {
						System.out.println("Disposing " + disposableBean.toString());
						disposableBean.destroy();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			prototypeBeans.clear();
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;

	}

}
