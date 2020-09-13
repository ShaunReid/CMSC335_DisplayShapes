package shapes_2;

/*
File name: Main.java
Date: 14 Jul 20
Author: Shaun Reid
Purpose: The Main class builds the GUI and incorporates all of the listeners and logic.  
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	//Declaring all variables and GUI components
	static String[] shapeNames = {"Circle", "Rectangle", "Square", "Triangle", "Cone", "Cube", "Cylinder", "Sphere", "Torus"};
	static String selectedItem;
	static JComboBox<?> shapeList = new JComboBox<Object>(shapeNames);
	static JLabel comboLbl = new JLabel("Choose a shape:");
	static JLabel valueOneLbl = new JLabel("First value: ");
	static JTextField valueOneTxt = new JTextField(10);
	static JLabel valueTwoLbl = new JLabel("Second Value: ");
	static JTextField valueTwoTxt = new JTextField(10);
	static JButton displayBtn = new JButton("Display");
	
	//Calls the GUI and action listeners
	public static void main(String[] args) {
		
		buildGUI();

	}
	
	//Builds GUI and collects all data
	public static void buildGUI() {
		
		//Builds panels for the components.
		JPanel comboBxPnl = new JPanel(new FlowLayout());
		comboBxPnl.add(comboLbl);
		comboBxPnl.add(shapeList);
		JPanel valuePnl = new JPanel(new FlowLayout());
		
		
		//Builds the main frame.
		JFrame frame = new JFrame("Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(comboBxPnl);
		frame.pack();
		frame.setVisible(true);
		
	 
			//Action listener for the shape combobox. 
			shapeList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JComboBox<?> cb = (JComboBox<?>)e.getSource();
					selectedItem = (String)cb.getSelectedItem();
					
					//If circle is selected from the combobox.
					if(selectedItem.equals("Circle")) {
						valueOneLbl.setText("Radius: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						
					//If rectangle is selected from the combobox.	
					} else if (selectedItem.equals("Rectangle")) {
						valueOneLbl.setText("Length: ");
						valueTwoLbl.setText("Width: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						valuePnl.add(valueTwoLbl);
						valuePnl.add(valueTwoTxt);	
						
					//If square is selected from the combobox.	
					} else if (selectedItem.equals("Square")) {
						valueOneLbl.setText("Side: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						
					//If triangle is selected from the combobox.	
					} else if (selectedItem.equals("Triangle")) {
						valueOneLbl.setText("Base: ");
						valueTwoLbl.setText("Height: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						valuePnl.add(valueTwoLbl);
						valuePnl.add(valueTwoTxt);
						
					//If cone is selected from the combobox.	
					} else if (selectedItem.equals("Cone")) {
						valueOneLbl.setText("Height: ");
						valueTwoLbl.setText("Radius: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						valuePnl.add(valueTwoLbl);
						valuePnl.add(valueTwoTxt);
						
					//If cube is selected from the combobox.	
					} else if (selectedItem.equals("Cube")) {
						valueOneLbl.setText("Side: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						
					//If cylinder is selected from the combobox.	
					} else if (selectedItem.equals("Cylinder")) {
						valueOneLbl.setText("Height: ");
						valueTwoLbl.setText("Radius: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						valuePnl.add(valueTwoLbl);
						valuePnl.add(valueTwoTxt);
						
					//If sphere is selected from the combobox.	
					} else if (selectedItem.equals("Sphere")) {
						valueOneLbl.setText("Radius: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						
					//If torus is selected from the combobox.	
					} else if (selectedItem.equals("Torus")) {
						valueOneLbl.setText("Major Radius: ");
						valueTwoLbl.setText("Minor Radius: ");
						valuePnl.add(valueOneLbl);
						valuePnl.add(valueOneTxt);
						valuePnl.add(valueTwoLbl);
						valuePnl.add(valueTwoTxt);
					}
					
					
					valuePnl.add(displayBtn);
					frame.add(valuePnl);
					frame.pack();
				}
			});
			
			//Button action listener that sends data to the individual shapes
			displayBtn.addActionListener(new ActionListener() {
				
				
					public void actionPerformed(ActionEvent e) {
						
					try {
						double firstVal = Double.parseDouble(valueOneTxt.getText());
						double secondVal;
						
						//Creates circle object
						if(selectedItem.equals("Circle")) {
							Circle circle = new Circle(firstVal);
							circle.callInner();
							
						//Creates rectangle object	
						} else if (selectedItem.equals("Rectangle")) {
							secondVal = Double.parseDouble(valueTwoTxt.getText());
							Rectangle rectangle = new Rectangle(firstVal, secondVal);
							rectangle.callInner();
							
						//Creates square object	
						} else if (selectedItem.equals("Square")) {
							Square square = new Square(firstVal);
							square.callInner();
							
						//Creates triangle object	
						} else if (selectedItem.equals("Triangle")) {
							secondVal = Double.parseDouble(valueTwoTxt.getText());
							Triangle triangle = new Triangle(firstVal, secondVal);
							triangle.callInner();
							
						//Creates cone object	
						} else if (selectedItem.equals("Cone")) {
							secondVal = Double.parseDouble(valueTwoTxt.getText());
							Cone cone = new Cone(firstVal, secondVal);
							cone.callInner();
							
						//Creates cube object	
						} else if (selectedItem.equals("Cube")) {
							Cube cube = new Cube(firstVal);
							cube.callInner();
							
						//Creates cylinder object	
						} else if (selectedItem.equals("Cylinder")) {
							secondVal = Double.parseDouble(valueTwoTxt.getText());
							Cylinder cylinder = new Cylinder(firstVal, secondVal);
							cylinder.callInner();
							
						//Creates sphere object	
						} else if (selectedItem.equals("Sphere")) {
							Sphere sphere = new Sphere(firstVal);
							sphere.callInner();
							
						//Creates torus object	
						} else if (selectedItem.equals("Torus")) {
							secondVal = Double.parseDouble(valueTwoTxt.getText());
							Torus torus = new Torus(firstVal, secondVal);
							torus.callInner();
					    }
					}
				
					//Catches if the wrong information is entered into the text boxes.
					 catch (NumberFormatException exc) {
						JPanel warningPanel = new JPanel();
						JOptionPane.showMessageDialog(warningPanel, "Wrong Input. Enter size in pixels.", "Warning", JOptionPane.ERROR_MESSAGE);
					}
				
				} 
			
				
				
			});
		
	}


}
