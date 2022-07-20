package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.services.ProductServiceInterceptor;

@Component
public class ProductServiceInterceptorConfig extends WebMvcConfigurerAdapter {

	@Autowired
	ProductServiceInterceptor productServiceInterceptor;
	
	@Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(productServiceInterceptor);
	   }
}
