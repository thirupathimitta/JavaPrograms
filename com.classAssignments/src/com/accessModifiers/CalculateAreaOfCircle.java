package com.accessModifiers;

class Circle{
	
	final double pi=3.14;
	double radius ;
	Circle( double  radius){
		this.radius =radius;
		
	}
	double  calculateArea() {
		double area = pi*radius*radius;
		return  area;
	}
}

public class CalculateAreaOfCircle {
	
	Circle c= new Circle(5.5);
	

	public static void main(String[] args) {
		CalculateAreaOfCircle ca =new CalculateAreaOfCircle();
		
		
    double circleArea = ca.c.calculateArea();
    System.out.println("area of circle is " +circleArea);
	}

}
