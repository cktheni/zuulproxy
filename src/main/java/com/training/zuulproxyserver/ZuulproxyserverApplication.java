package com.training.zuulproxyserver;

import com.training.zuulproxyserver.filters.ErrorFilter;
import com.training.zuulproxyserver.filters.PostFilter;
import com.training.zuulproxyserver.filters.PreFilter;
import com.training.zuulproxyserver.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulproxyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulproxyserverApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}


}
