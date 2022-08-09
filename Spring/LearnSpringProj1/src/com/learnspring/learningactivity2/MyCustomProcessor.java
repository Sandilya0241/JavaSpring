package com.learnspring.learningactivity2;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomProcessor implements BeanFactoryAware, BeanPostProcessor, DisposableBean {

	private BeanFactory beanFactory;
	
	private final List<Object> prototypeBean = new LinkedList<>();
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanFactory.isPrototype(beanName)) {
			synchronized (prototypeBean) {
				prototypeBean.add(bean);
			}
			
		}
		return bean;
	}
	
	@Override
	public void destroy() throws Exception {
		
		synchronized (prototypeBean) {
			for (Object bean : prototypeBean) {
				if (bean instanceof DisposableBean) {
					DisposableBean disposableBean = (DisposableBean)bean;
					try {
						disposableBean.destroy();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			prototypeBean.clear();
		}
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

}
