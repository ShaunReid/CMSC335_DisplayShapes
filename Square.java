package shapes_2;

/*
File name: Square.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Square class inherits dim1 from both TwoDimShape and Shape.  Square also implements area and draw shape as required by TwoDimShape.   
 */

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Square extends TwoDimShape {

	//Declaring the side variable
	double side;
	
	//Square constructor
	Square(double inDim1) {
		side = inDim1;
		NumberOfDimensions = 2;
	
	}

	//Calculates the area of a Square object.
	@Override
	double area() {
		
		area = side * side;
		
		return area;
	}
	
	//Calls the inner class. 
	void callInner() {
		DrawShape inner = new DrawShape();
		inner.main(null);
	}

	//Draws the square shape. 
	public class DrawShape extends JPanel {
		
		public static final long serialVersionUID = 1L;
		
		public void paint (Graphics g) {
			
			g.drawRect(100, 100, (int)Math.round(side), (int)Math.round(side));
		}
		
		public void main(String[] args) {
			JFrame squareFrame = new JFrame("Square");
			squareFrame.getContentPane().add(new DrawShape());
			squareFrame.setSize(500, 500);
			squareFrame.setLocationRelativeTo(null);
			squareFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			squareFrame.setVisible(true);
		}
		
	}

	
}

