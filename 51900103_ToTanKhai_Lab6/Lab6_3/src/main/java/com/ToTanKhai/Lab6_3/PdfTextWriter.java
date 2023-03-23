package com.ToTanKhai.Lab6_3;


import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class PdfTextWriter implements TextWriter {
	
	public void write(String fileName, String text)throws IOException{
		PrintWriter printWriter = new PrintWriter( new FileWriter(fileName));
		printWriter.println("Printing in pdf format: ");
		printWriter.print(text);
		printWriter.close();
	}

}
