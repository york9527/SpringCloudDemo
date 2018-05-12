package com.coderyu.springcloud.ribbonconsumer.ribbonconsumer.controller;

import com.coderyu.springcloud.ribbonconsumer.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
        return "Ribbon-Consumer "+helloService.helloService();
    }


}
