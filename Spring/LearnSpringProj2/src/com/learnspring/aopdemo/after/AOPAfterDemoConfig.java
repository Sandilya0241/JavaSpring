package com.learnspring.aopdemo.after;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.learnspring.aopdemo.after")
@Configuration
public class AOPAfterDemoConfig {

}
