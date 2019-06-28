package com.provider.controller;

import com.example.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public UserEntity hello() {

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("hello-service");
        for (ServiceInstance serviceInstance : serviceInstanceList) {
            System.out.println(" request path: "+ serviceInstance.getUri());
            System.out.println(" host: "+ serviceInstance.getHost());
            System.out.println(" serviceId: "+ serviceInstance.getServiceId());
            System.out.println();
        }

        List<String> serviceList = discoveryClient.getServices();
        for (String serviceStr : serviceList){
            System.out.println("service--->"+serviceStr);
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setAge(26);
        userEntity.setCreateTime(new Date());
        userEntity.setNickname("LB先生");
        userEntity.setUserName("LB");
        userEntity.setSex(1);
        
        return userEntity;
    }

}
