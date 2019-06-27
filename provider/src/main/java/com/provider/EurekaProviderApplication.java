package com.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 使用注解@EnableEurekaClient开启注册功能,激活Eureka的DiscoveryClient实现
 * 
 * @author Mr.LB
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

}
