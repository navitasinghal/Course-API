package org.javaBrain.model;

public class Circle {
	private String name;
	private int id;
	
	public Circle( int id,String name) {
		setId(id);
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
