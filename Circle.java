package shapes_2;

/*
File name: Circle.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Circle class inherits dim1 and pi from both TwoDimShape and Shape.  Circle also implements area and draw shape as required by TwoDimShape.   
 */

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Circle extends TwoDimShape {

	double radius;
	
	//Circle constructor
	Circle(double inDim1) {
		radius = inDim1;
		NumberOfDimensions = 2;
		
	}

	//Calculates the area of a Circle object.
	@Override
	double area() {
		
		area = (radius * radius) * pi;
		
		return area;
	}

	
	//Calls the inner class
	void callInner() {
		DrawShape inner = new DrawShape();
		inner.main(null);
	}
	
	//Inner class that draws the circle shape.
	public class DrawShape extends JPanel {
		
		public static final long serialVersionUID = 1L;
		
		public void paint (Graphics g) {
			
			g.drawOval(100, 100, (int)Math.round(radius), (int)Math.round(radius));
		}
		
		public void main(String[] args) {
			JFrame circleFrame = new JFrame("Circle");
			circleFrame.getContentPane().add(new DrawShape());
			circleFrame.setSize(500, 500);
			circleFrame.setLocationRelativeTo(null);
			circleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			circleFrame.setVisible(true);
		}
		
	}

}
