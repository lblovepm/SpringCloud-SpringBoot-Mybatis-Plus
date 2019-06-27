package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 使用注解@EnableEurekaClient开启注册功能,激活Eureka的DiscoveryClient实现
 * 
 * @author Mr.LB
 *
 */

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args);
	}
	
	@Bean
    @LoadBalanced		//@LoadBalanced 注解声明开启 负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
