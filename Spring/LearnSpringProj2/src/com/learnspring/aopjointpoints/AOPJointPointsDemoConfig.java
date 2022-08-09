package com.learnspring.aopjointpoints;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.learnspring.aopjointpoints")
public class AOPJointPointsDemoConfig {
}
