package shapes_2;

/*
File name: Cylinder.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Cylinder class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Cylinder also implements volume and display shape as required by ThreeDimShape.   
 */

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cylinder extends ThreeDimShape {

	//Declaring variables
	double height;
	double radius;
	
	//Cylinder constructor.
	Cylinder(double inDim1, double inDim2) {
		height = inDim1;
		radius = inDim2;
		NumberOfDimensions = 3;
	}

	////Calculates the volume of a Cylinder object.
	@Override
	double volume() {
		
		volume = (pi * height * (radius * radius));
		
		return volume;
	}

	//Calls the inner class. 
	void callInner() {
		DisplayShape inner = new DisplayShape();
		inner.main(null);
	}
	
	//Displays the cylinder image. 
	public class DisplayShape extends JPanel{
		
		public static final long serialVersionUID = 1L;
		
		Image cylinderImg;
		
		public DisplayShape() {
			
			try {
				File cylinderImgFile = new File("C:/Users/rdizz/eclipse-workspace/CMSC335Proj2/Images/Cylinder.png");
				
				cylinderImg = ImageIO.read(cylinderImgFile);
				
			} catch(IOException e) {
				System.out.println("Cannot display image.");
			}
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(cylinderImg, 0, 0, null);
		}
		
		public void main(String[] args) {
			JFrame cylinderFrame = new JFrame("Cylinder");
			cylinderFrame.getContentPane().add(new DisplayShape());
			cylinderFrame.setSize(500, 500);
			cylinderFrame.setLocationRelativeTo(null);
			cylinderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			cylinderFrame.setVisible(true);
		}
	}

}

