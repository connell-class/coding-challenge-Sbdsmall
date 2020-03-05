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

import com.grocery.models.GroceryItem;
import com.grocery.service.GroceryItemService;

@RestController
@RequestMapping(value = "/item")
@CrossOrigin(origins = "http://localhost:3000")
public class GroceryItemController {

	@Autowired
	GroceryItemService gis;
	
	@GetMapping("/all")
	public Iterable<GroceryItem> getAllitems(){
		return gis.findAll();
	}
	
	public GroceryItem findGLById(@PathVariable("id") int id) {
		return gis.findGroceryitemById(id);
	}
	
	@PostMapping("/new")
    public String insert(@RequestBody GroceryItem a) {
        gis.save(a);
        return "Groceryitem has been added";
    }

    @PutMapping("/updated")
    public String update(@RequestBody GroceryItem a) {
        gis.update(a);
        return "Groceryitem has been updated";
	}
    
    @PutMapping("/updatedbyid")
    public String updateById(@RequestBody int id){
        gis.updateById(id);
        return "Groceryitem has been updated by its ID";
    }
    @PutMapping("/deleted")
    public String delete(@RequestBody GroceryItem a) {
        gis.delete(a);
        return "Groceryitem has been deleted";
	}
    
    @DeleteMapping("/deletedbyid")
    public String deleteById(@RequestBody int id){
        gis.deleteById(id);
        return "Groceryitem has been deleted by ID";
    }
	
}
