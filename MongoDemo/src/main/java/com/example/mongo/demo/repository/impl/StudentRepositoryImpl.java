package com.example.mongo.demo.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.example.mongo.demo.model.Student;
import com.example.mongo.demo.repository.Repository;
import com.mongodb.WriteResult;

@org.springframework.stereotype.Repository
public class StudentRepositoryImpl implements Repository<Student> {
	
	
	@Autowired
	public MongoTemplate mongotemplate;

	@Override
	public void saveObject(Student object) {
		// TODO Auto-generated method stub
		mongotemplate.insert(object);
		
	}

	@Override
	public List<Student> getAllObjects() {
		// TODO Auto-generated method stub
		return mongotemplate.findAll(Student.class);
	}

	@Override
	public Student getObject(int id) {
		// TODO Auto-generated method stub
		return mongotemplate.findOne(new Query(Criteria.where("id").is(id)), Student.class);
	}

	@Override
	public WriteResult updateObject(String id, String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult removeObject(int id) {
		// TODO Auto-generated method stub
		return mongotemplate.remove(new Query(Criteria.where("id").is(id)),Student.class);
	}

}
