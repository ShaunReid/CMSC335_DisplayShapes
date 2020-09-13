package shapes_2;
/*
File name: Sphere.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Sphere class inherits dim1 from both ThreeDimShape and Shape.  Sphere also implements volume and display shape as required by ThreeDimShape.   
 */

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sphere extends ThreeDimShape {

	//Declaring the variable
	double radius;
	
	//Sphere constructor.
	Sphere(double inDim1) {
		radius = inDim1;
		NumberOfDimensions = 3;
	}

	//Calculates the volume of a Sphere object.
	@Override
	double volume() {
		
		volume = (4 * pi * (radius * radius * radius))/3;
		
		return volume;
	}

	//Calls the inner class. 
	void callInner() {
		DisplayShape inner = new DisplayShape();
		inner.main(null);
	}
	
	//Displays the sphere image. 
	public class DisplayShape extends JPanel{
		
		public static final long serialVersionUID = 1L;
		
		Image sphereImg;
		
		public DisplayShape() {
			
			try {
				File sphereImgFile = new File("C:/Users/rdizz/eclipse-workspace/CMSC335Proj2/Images/Sphere.png");
				
				sphereImg = ImageIO.read(sphereImgFile);
				
			} catch(IOException e) {
				System.out.println("Cannot display image.");
			}
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(sphereImg, 0, 0, null);
		}
		
		public void main(String[] args) {
			JFrame sphereFrame = new JFrame("Sphere");
			sphereFrame.getContentPane().add(new DisplayShape());
			sphereFrame.setSize(500, 500);
			sphereFrame.setLocationRelativeTo(null);
			sphereFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			sphereFrame.setVisible(true);
		}
	}

}

