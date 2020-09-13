package shapes_2;

/*
File name: ThreeDimShape.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The ThreeDimShape class is an abstract class that inherits from Shape. ThreeDimShape demands that it's children implement the volume method and display shape.  
 */

public abstract class ThreeDimShape extends Shape {

	double volume;
	
	//Abstract class that requires three dimensional shapes to implement the volume method.  
	abstract double volume();
	
	//Abstract class that requires all inherited shapes to implement the display image class. 
	abstract class DisplayShape {}
	
	
}
