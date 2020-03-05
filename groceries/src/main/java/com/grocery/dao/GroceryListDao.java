package com.grocery.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.grocery.models.GroceryList;

import org.springframework.data.repository.CrudRepository;

@Repository
@Transactional
public interface GroceryListDao extends CrudRepository<GroceryList, Integer>{

	GroceryList findById(int id);
	
}
