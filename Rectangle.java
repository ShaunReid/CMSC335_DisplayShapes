package shapes_2;
/*
File name: Rectangle.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Rectangle class inherits dim1 and dim2 from both TwoDimShape and Shape.  Rectangle also implements area and draw shape as required by TwoDimShape.   
 */

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle extends TwoDimShape {

	//Declaring variables
	double length;
	double width;
	
	//Rectangle constructor
	Rectangle(double inDim1, double inDim2) {
		length = inDim1;
		width = inDim2;
		NumberOfDimensions = 2;
		
	}

	//Calculates the area of a Rectangle object.
	@Override
	double area() {
		
		area = length * width;
		return area;
	}

	//Calls the inner class.
	void callInner() {
		DrawShape inner = new DrawShape();
		inner.main(null);
	}
	
	//Draws the rectangle shape. 
	public class DrawShape extends JPanel {
		
		public static final long serialVersionUID = 1L;
		
		public void paint (Graphics g) {
			
			g.drawRect(100, 100, (int)Math.round(length), (int)Math.round(width));
		}
		
		public void main(String[] args) {
			JFrame rectangleFrame = new JFrame("Rectangle");
			rectangleFrame.getContentPane().add(new DrawShape());
			rectangleFrame.setSize(500, 500);
			rectangleFrame.setLocationRelativeTo(null);
			rectangleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			rectangleFrame.setVisible(true);
		}
		
	}

}

