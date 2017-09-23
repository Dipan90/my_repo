package com.example.redis.util.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.redis.util.in.RedisUtil;
import com.example.redis.util.pojo.Student;

public class RedisUtilImpl implements RedisUtil {
	
	@Autowired
	public RedisTemplate<String, Object> redistemplate;
	
	public HashOperations<String, String, Object> hashOps;

	@PostConstruct
	public void init(){
		hashOps=redistemplate.opsForHash();
	}
	
	@Override
	public Object getObject(String key, String hashKey)  throws RedisConnectionFailureException,Exception{
		try{
		Student student=(Student)hashOps.get(key, hashKey);
		return student;
		}catch(RedisConnectionFailureException redisEx){
			return new RedisConnectionFailureException("Sorry unable to connect to redis");
		}
		catch(Exception ex){
			return new Exception(ex.getMessage());
		}
	}

	@Override
	public String setObject(String key, String hashKey, Object template) throws RedisConnectionFailureException,Exception{
		try{
			hashOps.putIfAbsent(key, hashKey, template);
			return "Sucess";
		}catch(RedisConnectionFailureException redisEx){
			throw new RedisConnectionFailureException("Sorry unable to connect to redis");
		}
		catch(Exception ex){
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public String setListObject(List<Object> list) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("This method is not Supported");
	}

	

}
