package com.example.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.redis.repository.RedisRepo;
import com.example.redis.util.impl.RedisUtilImpl;
import com.example.redis.util.in.RedisUtil;


@Configuration
public class AppConfig {
	
	 @Bean
	  public JedisConnectionFactory jedisconnectionFactory()
	  {
	    return new JedisConnectionFactory();
	  }
	  
	  @Bean
	  public RedisTemplate<String, Object> redistemplate()
	  {
	    RedisTemplate<String, Object> redistemplate = new RedisTemplate<String,Object>();
	    redistemplate.setConnectionFactory(jedisconnectionFactory());
	    return redistemplate;
	  }
	
	@Bean
	public RedisUtil redisUtil(){
		return new RedisUtilImpl();
	}
	
	@Bean
	public RedisRepo redisrepo(){
		return new RedisRepo();
	}

}
