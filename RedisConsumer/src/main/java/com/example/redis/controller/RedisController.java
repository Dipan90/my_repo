package com.example.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.redis.repository.RedisRepo;
import com.example.redis.util.pojo.Student;

@RestController
public class RedisController {
	
	@Autowired
	public RedisRepo redisrepo;
	
	
	@PostMapping("/redis/getStudent")
	public @ResponseBody Student getStudent(@RequestBody Student student) throws RedisConnectionFailureException,Exception{
		return (Student)redisrepo.getStudent(Integer.toString(student.getId()));
	}
	
	@PostMapping("/redis/setStudent")
	public @ResponseBody String setStudent(@RequestBody Student student) throws Exception{
		
		String result=redisrepo.setStudent(Integer.toString(student.getId()), student);
		return result;
	}

}
