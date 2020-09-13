package shapes_2;

/*
File name: Cone.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Cone class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Cone also implements volume and display shape as required by ThreeDimShape.   
 */

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cone extends ThreeDimShape {

	//Declaring variables
	double height;
	double radius;
	
	//Cone constructor
	Cone(double inDim1, double inDim2) {
		height = inDim1;
		radius = inDim2;
		NumberOfDimensions = 3;
		
	}

	//Calculates the volume of a Cone object.
	@Override
	double volume() {
		
		volume =  ((radius * radius) * pi * height)/3;
		
		return volume;
	}

	//Calls the inner class. 
	void callInner() {
		DisplayShape inner = new DisplayShape();
		inner.main(null);
	}
	
	//Class that displays the Cone image. 
	public class DisplayShape extends JPanel {
		
		public static final long serialVersionUID = 1L;
		
		Image coneImg;
		
		public DisplayShape() {
			
			try {
				File coneImgFile = new File("C:/Users/rdizz/eclipse-workspace/CMSC335Proj2/Images/Cone.png");
				
				coneImg = ImageIO.read(coneImgFile);
				
			} catch(IOException e) {
				System.out.println("Cannot display image.");
			}
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(coneImg, 0, 0, null);
		}
		
		public void main(String[] args) {
			JFrame coneFrame = new JFrame("Cone");
			coneFrame.getContentPane().add(new DisplayShape());
			coneFrame.setSize(500, 500);
			coneFrame.setLocationRelativeTo(null);
			coneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			coneFrame.setVisible(true);
		}
	}

}
