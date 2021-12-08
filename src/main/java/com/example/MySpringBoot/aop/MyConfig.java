package com.example.MySpringBoot.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class MyConfig {

}
