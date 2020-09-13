package shapes_2;

/*
File name: TwoDimShape.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The TwoDimShape class is an abstract class that inherits from Shape. TwoDimShape demands that it's children implement the area method and the draw shape inner class.  
 */
public abstract class TwoDimShape extends Shape{

	double area;
	
	//Abstract area method that requires an area method from TwoDimShape's children
	abstract double area();
	
	//Abstract method that requires all inherited shapes to implement a draw class.
	abstract class DrawShape {}
	
	
}
