package com.starter.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starter.kafka.dto.User;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/userapi")
public class UserController {
    
    @Autowired
    private UserProducerService userproducerservice;


    @PostMapping("/publishUserData")
    public void sendData(@RequestBody User user){
        userproducerservice.sendData(user);
    }
}
