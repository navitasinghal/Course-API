package org.javaBrain.springBootStarter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private int id;
	private String name;
	private String description;
	
	
	
	@Override
	public String toString() {
		return "Topic [name=" + name + ", description=" + description + ", id="
				+ id + "]";
	}
	
	public Topic(){
		
	}
	public Topic(String name, String description, int id) {
		super();
		this.name = name;
		this.description = description;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
