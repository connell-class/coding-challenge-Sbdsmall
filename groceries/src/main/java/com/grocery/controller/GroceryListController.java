package com.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.models.GroceryList;
import com.grocery.service.GroceryListService;

@RestController
@RequestMapping(value = "/list")
//@CrossOrigin(origins = "http://localhost:3000")
public class GroceryListController {

	@Autowired
	GroceryListService gls;
	
	@GetMapping("/all")
	public Iterable<GroceryList> getAllLists(){
		return gls.findAll();
	}
	
	public GroceryList findGLById(@PathVariable("id") int id) {
		return gls.findGroceryListById(id);
	}
	
	@PostMapping("/new")
    public String insert(@RequestBody GroceryList a) {
        gls.save(a);
        return "GroceryList has been added";
    }

    @PutMapping("/updated")
    public String update(@RequestBody GroceryList a) {
        gls.update(a);
        return "GroceryList has been updated";
	}
    
    @PutMapping("/updatedbyid")
    public String updateById(@RequestBody int id){
        gls.updateById(id);
        return "GroceryList has been updated by its ID";
    }
    @PutMapping("/deleted")
    public String delete(@RequestBody GroceryList a) {
        gls.delete(a);
        return "GroceryList has been deleted";
	}
    
    @DeleteMapping("/deletedbyid")
    public String deleteById(@RequestBody int id){
        gls.deleteById(id);
        return "GroceryList has been deleted by ID";
    }
}
