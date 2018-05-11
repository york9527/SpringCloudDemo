package com.coderyu.springcloud.ribbonconsumer.ribbonconsumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://eureka-provider/hello",String.class).getBody();
    }

    public String helloFallback(){
        return "error";
    }

}