//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.setPenWidth(10);
		rob.penDown();
		//3. Ask the user what color they would like the robot to draw
		for(int l = 0; l < 100 ;  l++) {
		
		String col = JOptionPane.showInputDialog(null, "What color do you want to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (col.equalsIgnoreCase("blue")) {
		rob.setPenColor(20,20,200);
		}else if(col.equalsIgnoreCase("red")){
		rob.setPenColor(200,20,20);
		}else if(col.equalsIgnoreCase("green")) {
		rob.setPenColor(20,200,20);
		}else if(col.equalsIgnoreCase("orange")) {
		rob.setPenColor(Color.ORANGE);
		}else if(col.equalsIgnoreCase("yellow")) {
		rob.setPenColor(Color.YELLOW);
		}else if(col.equalsIgnoreCase("brown")) {
		rob.setPenColor(229,139,2);
		}else if(col.equalsIgnoreCase("purple")) {
		rob.setPenColor(186,37,232);
		} else{
		rob.setRandomPenColor();
		}
		for(int m = 0; m < 36; m++) {
			rob.turn(10);
		rob.move(10);
        //6. If the user doesn’t enter anything, choose a random color
		}}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
