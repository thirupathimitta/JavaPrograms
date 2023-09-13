package com.streams;

import java.util.List;

public class Students {
	
	private String name;
	private int id;
	private List<String> citesStudiedIn;

	public Students(String name, int id, List<String> citesStudiedIn) {

		this.name = name;
		this.id = id;
		this.citesStudiedIn = citesStudiedIn;
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

	public List<String> getCitesStudiedIn() {
		return citesStudiedIn;
	}

	public void setCitesStudiedIn(List<String> citesStudiedIn) {
		this.citesStudiedIn = citesStudiedIn;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", citesStudiedIn=" + citesStudiedIn + "]";
	}
	  
	
	
}
