package com.hand.controller;

import com.hand.domain.User;
import com.hand.domain.model.AllowancePOSTBody;
import com.hand.domain.model.AllowancePOSTResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hugo on 2017/6/19.
 */


@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayhello(HttpServletRequest request) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("host:{} serverId : {}", instance.getHost(), instance.getServiceId());
        return "hello";
    }

    @RequestMapping(value = "/hai", method = RequestMethod.GET)
    public String sayhai(HttpServletRequest request) {
        RestTemplate restTemplate = new RestTemplate();

        Map map = new HashMap<String, String>();
        map.put("CustomerID", "11111111");
        map.put("Data", "12344");
        String url = "http://einvoice.wellan.com.tw/eInvoiceApiTEST/api/B2C/Invoice";
        return restTemplate.postForObject(url, map, String.class);

    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public User getUser(@RequestBody User user) {
        RestTemplate restTemplate = new RestTemplate();
        logger.info(user.toString());
        User user1 = new User();
        user1.setUserName("qq");
        user1.setPassWord("11");
        user1.setUserNumber("qqqqq");
        return user1;

}

    @RequestMapping(value = "api/B2C/Invoice", method = RequestMethod.POST)
    @ResponseBody
    public AllowancePOSTResponse abcd(@RequestBody AllowancePOSTBody body) {

        AllowancePOSTResponse response = new AllowancePOSTResponse();
        response.setReturnCode("111111111111");
        response.setMessage("cuowu");
        System.out.println(response.toString());
        System.out.println(response.toString());
        return response;

    }


}
