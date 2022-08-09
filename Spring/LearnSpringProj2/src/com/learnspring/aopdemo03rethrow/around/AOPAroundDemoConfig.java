package com.learnspring.aopdemo03rethrow.around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.learnspring.aopdemo03rethrow.around")
public class AOPAroundDemoConfig {

}
