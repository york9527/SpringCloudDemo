package com.coderyu.springcloud.eurekaprovider.controller;

import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    private final Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping("/hello")
    public String serviceInstancesByApplicationName(){
        logger.info("hello action requested");
        return "Hello word!";
            //return eurekaClient.getApplications();
    }

}
