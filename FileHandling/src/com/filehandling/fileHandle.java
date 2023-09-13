package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandle {
	
	public static void main(String[] args) throws IOException {			
		String file="C:\\Users\\vinay\\Desktop\\gitSql\\data.txt";
		FileWriter  fw = new FileWriter(file);
			fw.write("Hi, good evening");
			fw.write("\n"); 
			fw.write("How are you?");
			fw.flush ( );	
			
			FileReader fr=	new FileReader(file);	
			BufferedReader br = new BufferedReader(fr);
			int lineCount = 0;
			int wordCount = 0;
			int characterCount = 0;		
			String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
                characterCount += line.length();
            }
            System.out.println("Character count: " + characterCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);
            fw.close( ) ;
	}

}
