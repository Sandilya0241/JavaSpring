package com.learnspring2.annotations.beanscopewithcustomprocessor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyCustomBeanProcessor implements DisposableBean, BeanPostProcessor, BeanFactoryAware {

	
	private BeanFactory beanFactory;
	
	private final List<Object> prototypeBeans = new ArrayList<>();
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanFactory.isPrototype(beanName)) {
			synchronized (prototypeBeans) {
				prototypeBeans.add(bean);	
			}
		}
		return bean;
	}
	
	@Override
	public void destroy() throws Exception {
		synchronized (prototypeBeans) {
			for (Object bean : prototypeBeans) {
				if(bean instanceof DisposableBean) {
					DisposableBean beanToBeDestroyed = (DisposableBean)bean;
					try {
						System.out.println("Bean to be destroyed : " + beanToBeDestroyed.toString());
						beanToBeDestroyed.destroy();
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
