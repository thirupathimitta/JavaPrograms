package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exp1 {

	public static void main(String[] args) throws IOException {
		
	
		      
		        String filePath = "C:\\Users\\vinay\\Desktop\\gitSql/file.txt";

		     
		        File file = new File(filePath);

		        try {
		            // Create the file
		            boolean fileCreated = file.createNewFile();
		            
		            if (fileCreated) {
		                System.out.println("File created successfully.");
		            } else {
		                System.out.println("File already exists.");
		            }
		        } catch (IOException e) {
		            System.err.println("An error occurred while creating the file: " + e.getMessage());
		        }
		        
		        PrintWriter pw = new PrintWriter(filePath);
				pw.write("this is my f1 file data2223");
				pw.flush();
				pw.close();
		        
		        
		

	}

}
