package com.ankon.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    
    	
    	ApplicationContext factory= new AnnotationConfigApplicationContext(Appconfig.class);
       samsung obj =factory.getBean(samsung.class,Snapdragon.class);
       obj.config();
    }
}
