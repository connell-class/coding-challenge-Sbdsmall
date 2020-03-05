
package com.grocery.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.GroceryItem;

@Repository
@Transactional
public interface GroceryItemDao extends CrudRepository<GroceryItem, Integer> {

	GroceryItem findById(int id);
	
}
