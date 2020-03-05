package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.GroceryListDao;
import com.grocery.models.GroceryList;

@Service
public class GroceryListService {

	@Autowired
	GroceryListDao gld;
	
	public Iterable<GroceryList> findAll(){
		return gld.findAll();
	}
	
	 public GroceryList findGroceryListById(int id){
	        return gld.findById(id);
	    }

	    public void save(GroceryList list){
	        gld.save(list);
	    }

	    public void update(GroceryList list){
	        gld.save(list);
	    }

	    public void updateById(int id){
	    	GroceryList list = gld.findById(id);
	        gld.save(list);
	    }

	    public void delete(GroceryList list){
	        gld.delete(list);
	    }

	    public void deleteById(int id){
	    	GroceryList list = gld.findById(id);
	        gld.delete(list);
	    }
}
