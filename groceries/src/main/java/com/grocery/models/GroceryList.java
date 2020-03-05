package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_list")
public class GroceryList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String listName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listName == null) ? 0 : listName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryList other = (GroceryList) obj;
		if (id != other.id)
			return false;
		if (listName == null) {
			if (other.listName != null)
				return false;
		} else if (!listName.equals(other.listName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", listName=" + listName + "]";
	}

	public GroceryList(int id, String listName) {
		super();
		this.id = id;
		this.listName = listName;
	}

	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
