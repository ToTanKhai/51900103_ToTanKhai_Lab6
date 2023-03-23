package com.ToTanKhai.Project.Lab6_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ToTanKhai.Project.Lab6_2.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext("ApplicationConfiguration.class");
    	Product product1 = (Product) context.getBean("Product1");
    	Product product2 = (Product) context.getBean("Product2");
    	Product product3 = (Product) context.getBean("Product3");
    	
    	System.out.println("Name of the bean 1:" +product1.getName());
    	System.out.println("Name of the bean 2:" +product2.getName());
    	System.out.println("Name of the bean 3:" +product3.getName());
    }
}
