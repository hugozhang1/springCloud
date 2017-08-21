package com.hand.controller;

import com.hand.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hugo on 2017/6/30.
 */
@RestController
public class HaaController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value="get",method = RequestMethod.GET)
    @ResponseBody
    public String get(){
        RestTemplate restTemplate =new RestTemplate();
        User user = new User();
        user.setUserNumber("getnumber");
        String url ="http://192.168.1.109:8891/user";
        User u=restTemplate.postForObject(url,user,User.class);
        logger.info(u.toString());
        return u.toString();
    }
}
