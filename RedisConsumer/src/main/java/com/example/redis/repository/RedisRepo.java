package com.example.redis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;

import com.example.redis.util.in.RedisUtil;
import com.example.redis.util.pojo.Student;

public class RedisRepo {
	
	@Autowired
	public RedisUtil redisUtil;
	
	public Object getStudent(String key) throws RedisConnectionFailureException,Exception {

		Object student=(Student)redisUtil.getObject(key, "hash"+key);
		
		return student;
		
		
	}
	
	public String setStudent(String key,Object template) throws RedisConnectionFailureException,Exception {
		
		String result=redisUtil.setObject(key, "hash"+key, template);
		return result;
		
	}
	

}
