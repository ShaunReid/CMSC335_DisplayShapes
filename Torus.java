package shapes_2;
/*
File name: Torus.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Torus class inherits dim1 and dim2 from both ThreeDimShape and Shape.  Torus also implements volume and dispay shape as required by ThreeDimShape.   
 */

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Torus extends ThreeDimShape {

	//Declaring variables
	double majRadius;
	double minRadius;
	
	//Torus constructor
	Torus(double inDim1, double inDim2) {
		majRadius = inDim1;
		minRadius = inDim2;
		NumberOfDimensions = 3;
	}

	//Calculates the volume of a Torus object. 
	@Override
	double volume() {
		
		volume = (pi *(minRadius*minRadius)) * (2 * pi * majRadius);
		
		return volume;
	}

	//Calls the inner class. 
	void callInner() {
		DisplayShape inner = new DisplayShape();
		inner.main(null);
	}
	
	//Displays the torus shape. 
	public class DisplayShape extends JPanel{
		
		public static final long serialVersionUID = 1L;
		
		Image torusImg;
		
		public DisplayShape() {
			
			try {
				File torusImgFile = new File("C:/Users/rdizz/eclipse-workspace/CMSC335Proj2/Images/Torus.png");
				
				torusImg = ImageIO.read(torusImgFile);
				
			} catch(IOException e) {
				System.out.println("Cannot display image.");
			}
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(torusImg, 0, 0, null);
		}
		
		public void main(String[] args) {
			JFrame torusFrame = new JFrame("Torus");
			torusFrame.getContentPane().add(new DisplayShape());
			torusFrame.setSize(500, 500);
			torusFrame.setLocationRelativeTo(null);
			torusFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			torusFrame.setVisible(true);
		}
	}

}

