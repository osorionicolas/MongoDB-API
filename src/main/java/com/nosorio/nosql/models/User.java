package com.nosorio.nosql.models;

public class User {
	
	private String id;
	
	private String name;
	
	public User() {
	}
	
	public User(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
