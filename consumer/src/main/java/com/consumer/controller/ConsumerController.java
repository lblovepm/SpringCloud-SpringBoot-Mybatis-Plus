package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/get_provider_info")
	public String getProviderInfo(){
		String result = restTemplate.getForObject("http://hello-service/hello", String.class);
		System.out.println("时间是--->"+result);
		return result;
	}
}
