package com.filehandling;
import java.io.*;
public class FileStatus {

	public static void main(String[] args)throws IOException {
		
           int charCount =0;
           int wordCount =0;
           int lineCount =0;
     
		FileReader fr = 
				new FileReader("C:\\Users\\vinay\\Desktop\\gitSql\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line ;
		while((line = br.readLine()) != null) {
			
			lineCount++;
			String[] words=line.split("\\s+");
			wordCount =wordCount+words.length;
					
			
		}
		
    
     System.out.println("The number of characters: "+charCount);
     System.out.println("The number of words: "+wordCount);
     System.out.println("The number of lines:"+lineCount);
     System.out.println("navvy");

	}
	

}