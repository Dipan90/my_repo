package com.example.redis.util.in;

import java.util.List;

import org.springframework.data.redis.RedisConnectionFailureException;

public interface RedisUtil {
	
	public Object getObject(String key, String hashKey)  throws RedisConnectionFailureException,Exception;
	
	public String setObject(String key, String hashKey, Object template) throws RedisConnectionFailureException,Exception;
	
	public String setListObject(List<Object> list);

}
