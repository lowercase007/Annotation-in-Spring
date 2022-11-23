package com.Gaurav.springAnnotation;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	student ob = (student)context.getBean("Student", student.class);
    	System.out.println(ob);
    	
    	
    	System.out.println(ob.getMarks());
    	System.out.println(ob.getName().getClass().getName());
    }
}
