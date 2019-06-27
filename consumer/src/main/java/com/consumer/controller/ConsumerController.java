package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/get_provider_info")
	public String getProviderInfo(){
		String result = restTemplate.getForObject("http://hello-service/hello", String.class);
		restTemplate.postForEntity("http://hello-service/hello", new Object(), String.class);
		System.out.println("时间是--->"+result);
		return result;
	}
}
