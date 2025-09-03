package com.java.writefile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		//try(FileWriter writer = new FileWriter("test.txt")) {
			//C:\Users\USER\eclipse-workspace\basicjava\test.txt
		try(FileWriter writer = new FileWriter("C:\\temp\\misc\\test.txt")){
			// double backslash is needed for file path as single backslash for escape
			writer.write("I like taco");
			System.out.println("File written successfully");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Exception error");
		}
	}
}


//How to write file using java
//FileWriter = good for small or medium-sized text files
//BufferWriter = Better performance for large amount of text
//PrintWriter = Best for structured data, like reports or logs
//FileOutputStream = Best for binary files like images and audio files