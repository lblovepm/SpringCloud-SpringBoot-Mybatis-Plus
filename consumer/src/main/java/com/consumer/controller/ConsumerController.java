package com.consumer.controller;

import com.example.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/get_provider_info")
	public UserEntity getProviderInfo(){
		UserEntity result = restTemplate.getForObject("http://hello-service/hello", UserEntity.class);

		System.out.println("userId--->"+result.getUserId());
		System.out.println("userName--->"+result.getUserName());

		return result;
	}
}
