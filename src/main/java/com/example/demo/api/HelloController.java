package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RequestMapping("api/v1/hello")
@RestController
public class HelloController {




    @GetMapping
    public String hello(){

        InetAddress inetAddress = null;
        String hostAddress ="";
        String hostName  = "";
        try {
            inetAddress = InetAddress.getLocalHost();


            hostAddress = inetAddress.getHostAddress();

            hostName = inetAddress.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "{\"message\":\"Hello from "+hostName+" with ip "+hostAddress+"\"}";
    }

}
