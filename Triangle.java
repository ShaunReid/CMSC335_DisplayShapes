package shapes_2;

/*
File name: Triangle.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Triangle class inherits dim1 and dim2 from both TwoDimShape and Shape.  Triangle also implements area and draw shape as required by TwoDimShape.   
 */

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Triangle extends TwoDimShape {

	//Declaring variables
	double base;
	double height;
	
	//Triangle constructor
	Triangle(double inDim1, double inDim2) {
		base = inDim1;
		height = inDim2;
		NumberOfDimensions = 2;
		
	}

	//Calculates the area of a Triangle object.
	@Override
	double area() {

		area = (base * height)/2;
		
		return area;
	}
	
	//Calls the inner class. 
	void callInner() {
		DrawShape inner = new DrawShape();
		inner.main(null);
	}

	//Draws the triangle shape. 
	public class DrawShape extends JPanel {
		
		public static final long serialVersionUID = 1L;
		
		int xPoints[] = {250, (250 - ((int)Math.round(base)/2)), 250 + ((int)Math.round(base)/2)};
		int yPoints[] = {100, (int)Math.round(height) + 100, (int)Math.round(height) + 100};
		
		public void paint (Graphics g) {
			
			g.drawPolygon(xPoints, yPoints, 3);
		}
		
		public void main(String[] args) {
			JFrame triangleFrame = new JFrame("Triangle");
			triangleFrame.getContentPane().add(new DrawShape());
			triangleFrame.setSize(500, 500);
			triangleFrame.setLocationRelativeTo(null);
			triangleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			triangleFrame.setVisible(true);
		}
		
	}

}

