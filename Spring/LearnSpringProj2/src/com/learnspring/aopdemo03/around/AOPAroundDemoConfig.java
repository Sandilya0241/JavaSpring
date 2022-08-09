package com.learnspring.aopdemo03.around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.learnspring.aopdemo03.around")
public class AOPAroundDemoConfig {

}
