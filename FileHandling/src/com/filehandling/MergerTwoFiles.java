package com.filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergerTwoFiles {
	
	public static void main(String[] args) throws IOException {
		String file = "C:\\Users\\vinay\\Desktop\\gitSql/file.txt";
		String file1 = "C:\\Users\\vinay\\Desktop\\gitSql/file1.txt";
		String finalFile = "C:\\Users\\vinay\\Desktop\\gitSql/finalFile.txt";
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader(file1);
		BufferedReader br1 = new BufferedReader(fr1);		
		FileWriter fw = new FileWriter(finalFile);		
		String line;
		String s ="";	
		while((line = br.readLine())!=null) {		
			s=" " + line;
			fw.write(s);
			fw.flush ( );
			System.out.println(s);
		}	
		while((line =br1.readLine())!=null) {
			s=" " + line;
			fw.write(s+"\n");
			fw.flush ( );
			System.out.println(s);
		}
		
	}

}
