package com.maps;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertiesExp {
	public static void main(String[] args) throws Exception
	{
	// create a reader object on the properties file
		List l = new ArrayList();
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		System.out.println(l.size());
	
	FileReader reader1 = new FileReader("db1.properties");

	// create properties object
	
	  Properties p = new Properties();
	  
	  // Add a wrapper around reader object p.load(reader1);
	  
	  System.out.println(p.getProperty("name"));
	  System.out.println(p.getProperty("password"));
	 
	}
}
