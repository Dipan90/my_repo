package com.example.redis.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.redis","com.example.redisUtil"})
public class RedisConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisConsumerApplication.class, args);
	}
}
