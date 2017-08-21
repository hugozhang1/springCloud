package com.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Created by hugo on 2017/6/19.
 */

@EnableEurekaServer
@SpringBootApplication
class EurekaApplication {

    public  static  void  main(String []args){
        SpringApplication.run(EurekaApplication.class,args);
    }

}
