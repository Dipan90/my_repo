package com.example.mongo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.demo.model.Student;
import com.mongodb.WriteResult;

@RestController
@RequestMapping("/student")
public class StudentService {
	
	@Autowired
	public com.example.mongo.demo.repository.Repository<Student> repository;
	
	@RequestMapping("/create")
	public @ResponseBody String createStudent(@RequestBody Student student){
		repository.saveObject(student);
		return "Suceess";
	}
	
	@GetMapping("/getStudents")
	public @ResponseBody List<Student> getStudents(){
		return repository.getAllObjects();
	}
	
	@RequestMapping("/getStudent")
	public @ResponseBody Student getStudent(@RequestBody int id){
		return repository.getObject(id);
	}
	
	@RequestMapping("/removeStudent")
	public @ResponseBody String removeStudent(@RequestBody int id ){
		WriteResult result=repository.removeObject(id);
		
		if(result.getN() > 0 ){
			return "suceess";
		}
		
		return "";
	}
	
	/*@RequestMapping("/updateStudent")
	public @ResponseBody String updateStudent(@RequestBody Student student){
		WriteResult result=repository.updateObject(id, )
	}*/

}
