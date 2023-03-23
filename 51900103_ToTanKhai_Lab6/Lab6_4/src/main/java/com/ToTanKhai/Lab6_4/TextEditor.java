package com.ToTanKhai.Lab6_4;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class TextEditor {

	private String text;
	
	
	
	@Autowired
	@Qualifier("pdfTextWriter")
	public TextWriter writer;
	
	public void input(String text) {this.text = text;}
	
	public void save(String fileName) throws IOException{
		writer.write(fileName, this.text);
	}
}
