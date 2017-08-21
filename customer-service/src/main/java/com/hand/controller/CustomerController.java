package com.hand.controller;

import com.hand.domain.User;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hugo on 2017/6/30.
 */
@RestController
public class CustomerController {

    @RequestMapping(value="get",method = RequestMethod.GET)
    public String get(){
        RestTemplate restTemplate =new RestTemplate();
        User user = new User();
        user.setUserNumber("getnumber");
        String url ="http://192.168.1.109:8891/user";
        User u=restTemplate.postForObject(url,user,User.class);

        return u.toString();
    }
}
