package shapes_2;

/*
File name: Cube.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Cube class inherits dim1 from both ThreeDimShape and Shape.  Cube also implements volume and display shape as required by ThreeDimShape.   
 */

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cube extends ThreeDimShape {

	//Declaring variables
	double side;
	
	//Cube constructor
	Cube(double inDim1) {
		side = inDim1;
		NumberOfDimensions = 3;
	}

	//Calculates the volume of a Cube object.
	@Override
	double volume() {
		
		volume = side * side * side;
		
		return volume;
	}

	//Calls the inner class. 
	void callInner() {
		DisplayShape inner = new DisplayShape();
		inner.main(null);
	}
	
	//Displays the cube image. 
	public class DisplayShape extends JPanel{
		
		public static final long serialVersionUID = 1L;
		
		Image cubeImg;
		
		public DisplayShape() {
			
			try {
				File cubeImgFile = new File("C:/Users/rdizz/eclipse-workspace/CMSC335Proj2/Images/Cube.png");
				
				cubeImg = ImageIO.read(cubeImgFile);
				
			} catch(IOException e) {
				System.out.println("Cannot display image.");
			}
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(cubeImg, 0, 0, null);
		}
		
		public void main(String[] args) {
			JFrame cubeFrame = new JFrame("Cube");
			cubeFrame.getContentPane().add(new DisplayShape());
			cubeFrame.setSize(500, 500);
			cubeFrame.setLocationRelativeTo(null);
			cubeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			cubeFrame.setVisible(true);
		}
	}

}
