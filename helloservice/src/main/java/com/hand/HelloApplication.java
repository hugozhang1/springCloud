package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by hugo on 2017/6/19.
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class HelloApplication {

    public  static  void  main(String []args){
        SpringApplication.run(HelloApplication.class,args);
    }

}
