package com.learnspring.security.demoapp.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.learnspring.security.demoapp")
@PropertySource("classpath:jdbc_connection_pool.properties")
public class DemoAppConfig {

	@Autowired
	private Environment env;
	
	//set up a logger for diagnostics
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	// defining a bean for our security datasource
	@Bean
	public DataSource securityDataSource() {
		
		// Create a connection pool
		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();
		
		// set the JDBC driver class
		try {
			securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
		
		// log the connection props
		logger.info(">>> jdbc.url = " + env.getProperty("jdbc.driver"));
		logger.info(">>> jdbc.user = " + env.getProperty("jdbc.user"));
		
		// set database connection props
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
		// set connection pool props
		securityDataSource.setInitialPoolSize(getIntegerProperty("connection.pool.initialPoolSize"));
		securityDataSource.setMinPoolSize(getIntegerProperty("connection.pool.minPoolSize"));
		securityDataSource.setMaxPoolSize(getIntegerProperty("connection.pool.maxPoolSize"));
		securityDataSource.setMaxIdleTime(getIntegerProperty("connection.pool.maxIdleTime"));
		
		return securityDataSource;
	}
	
	private int getIntegerProperty(String propertyName) {
		String prop = env.getProperty(propertyName);
		
		int intPropValue = Integer.parseInt(prop);
		
		return intPropValue;
	}
	
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
    }
}
