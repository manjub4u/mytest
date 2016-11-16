package com.mkt.mytest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mkt.mytest.admin"})
public class AdminConfig {

}
