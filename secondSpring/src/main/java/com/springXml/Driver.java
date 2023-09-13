package com.springXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenexample.secondSpring.Car;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:com/mavenexample/secondSpring/Spring3.xml");

//		 by default singleton scope----> c1,c2 getting same hashcode 
		/*
		 * Car c1 = context.getBean("car", Car.class); Car c2 = context.getBean("car",
		 * Car.class); System.out.println(c1.hashCode() + "=" + c2.hashCode());
		 */
		
		//when i apply scope="prototype"  it will create  objects when getBean method called
		/*
		 * Car c1 = context.getBean("car", Car.class); Car c2 = context.getBean("car",
		 * Car.class); System.out.println("c1 hascode()-> "+c1.hashCode() +
		 * " not equal to  c2 hascode -> " + c2.hashCode());
		 */
		//Auto Wiring is done ==> byName
		
		Car c3 = context.getBean("car",Car.class);
		c3.drive();

	}

}
