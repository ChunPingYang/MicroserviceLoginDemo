package com.chunping.springcloud.consumer;

import com.chunping.springcloud.StreamMQMain8803;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceiveMessageListener {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
    }
}
