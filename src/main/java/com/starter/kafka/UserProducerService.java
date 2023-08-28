package com.starter.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.starter.kafka.dto.User;

@Service
public class UserProducerService {
    
    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;

    public void sendData(User user){
        kafkaTemplate.send("user-topic", user.getName(),user);
    }
}


