package com.ToTanKhai.Lab6_4;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
public class App 
{
	
	private static ApplicationContext applicationContext;
	 public static void main( String[] args )
	    {
		 	applicationContext = new AnnotationConfigApplicationContext("ApplicationConfiguration.class");
	    	TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
	    	textEditor.input("Spring is amazing");
	    	try {
	    		textEditor.save("spring.txt");
	    	}catch(IOException e) {
	    		System.out.print(e.getStackTrace());
	    	}
	    }
}
