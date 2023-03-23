package com.ToTanKhai.Lab6_3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;

public class TextEdittor {

	
	private String text;
	
	private TextWriter writer;
	
	@Autowired
	public void input(String text) { this.text = text;};
	
	public void save(String fileName) throws IOException{
		writer.write(fileName, this.text);
	}

	
}
