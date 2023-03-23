package com.ToTanKhai.Lab6_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext("ApplicationConfiguration.class");
    	TextEdittor textEdittor = (TextEdittor) context.getBean("textEditor");
    	textEdittor.input("Spring is amazing");
    	try {
    		textEdittor.save("spring.txt");
    	}catch(IOException e) {
    		System.out.print(e.getStackTrace());
    	}
    }
}
