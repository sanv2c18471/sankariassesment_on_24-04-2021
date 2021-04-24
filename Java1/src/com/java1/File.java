package com.java1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
public static void main(String[] args) {
//	try {
//		File f= new File();
//		if(f.c()) {
//			System.out.println("file created sucessfully");
//		}else {
//			System.out.println("file already exist");
//		}
//	}catch (IOException e) {
//		System.out.println(e);
//	}
	try {
		FileWriter wf = new FileWriter("sankari.txt");
		wf.write("We are java developers");
		wf.close();
		System.out.println("sucessfully Written");
	}catch (IOException e) {
		System.out.println(e);
		System.out.println("Error");
		}	
	
	try {
		FileReader r =new FileReader("sankari.txt");
		Scanner s = new Scanner(r);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println("Sucessfully read");
		}
			s.close();
			}catch (IOException e) {
				System.out.println(e);{
				System.out.println("Error");
				}	
			}
}
}
