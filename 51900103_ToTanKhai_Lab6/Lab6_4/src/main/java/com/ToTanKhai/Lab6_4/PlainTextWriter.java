package com.ToTanKhai.Lab6_4;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class PlainTextWriter implements TextWriter {

	
	public void write(String fileName, String text) throws IOException{
		PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
		printWriter.print(text);
		printWriter.close();
	}
}
