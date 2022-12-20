package com.digipay.restspringmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.digipay.restspringmvc" )
//public class SpringRestConfig implements WebMvcConfigurer {
public class SpringRestConfig  {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
////        WebMvcConfigurer.super.addInterceptors(registry);
////        registry.addInterceptor(new LogInter)
//    }
}
