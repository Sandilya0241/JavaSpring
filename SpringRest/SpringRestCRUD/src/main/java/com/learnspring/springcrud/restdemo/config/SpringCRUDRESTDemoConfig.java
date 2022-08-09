package com.learnspring.springcrud.restdemo.config;

import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com.learnspring.springcrud.restdemo")
@EnableWebMvc
@EnableTransactionManagement
@PropertySource({"classpath:springcrud-demorest.properties"})
public class SpringCRUDRESTDemoConfig {
	
	@Autowired
	private Environment env;
	
	private Logger LOGGER = Logger.getLogger(getClass().getName());
	
	@Bean
	public DataSource myDataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		try {
			dataSource.setDriverClass(env.getProperty("jdbc.driver"));
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		LOGGER.info("jdbc.url=" + env.getProperty("jdbc.url"));
		LOGGER.info("jdbc.user=" + env.getProperty("jdbc.user"));
		
		dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		dataSource.setUser(env.getProperty("jdbc.user"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		
		dataSource.setInitialPoolSize(getIntegerProperty("connection.pool.initialPoolSize"));
		dataSource.setMinPoolSize(getIntegerProperty("connection.pool.minPoolSize"));
		dataSource.setMaxPoolSize(getIntegerProperty("connection.pool.maxPoolSize"));
		dataSource.setMaxIdleTime(getIntegerProperty("connection.pool.maxIdleTime"));
		
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
		sessionFactory.setHibernateProperties(getHibernateProperties());
		
		return sessionFactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txMgr = new HibernateTransactionManager();
		txMgr.setSessionFactory(sessionFactory);
		return txMgr;
	}
	private Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		return props;
	}
	
	private int getIntegerProperty(String propertyName) {
		String propValue = env.getProperty(propertyName);
		int intPropValue = Integer.parseInt(propValue);
		return intPropValue;
	}
}
