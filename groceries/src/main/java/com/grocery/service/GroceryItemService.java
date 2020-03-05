package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.GroceryItemDao;
import com.grocery.models.GroceryItem;

@Service
public class GroceryItemService {

	@Autowired
	GroceryItemDao gid;
	
	public Iterable<GroceryItem> findAll(){
		return gid.findAll();
	}

	public GroceryItem findGroceryitemById(int id){
        return gid.findById(id);
    }

    public void save(GroceryItem item){
        gid.save(item);
    }

    public void update(GroceryItem item){
        gid.save(item);
    }

    public void updateById(int id){
    	GroceryItem items = gid.findById(id);
        gid.save(items);
    }

    public void delete(GroceryItem item){
        gid.delete(item);
    }

    public void deleteById(int id){
    	GroceryItem items = gid.findById(id);
        gid.delete(items);
    }
}
