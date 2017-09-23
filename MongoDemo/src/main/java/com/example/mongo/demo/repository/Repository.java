package com.example.mongo.demo.repository;

import java.util.List;

import com.mongodb.WriteResult;


public interface Repository<T> {
	
	
	public void saveObject(T object);
	
	public List<T> getAllObjects();
	
	public T getObject(int id);
	
	
	public WriteResult updateObject(String id,String param);
	
	public WriteResult removeObject(int id);
	
	
	
	
	
	

}
