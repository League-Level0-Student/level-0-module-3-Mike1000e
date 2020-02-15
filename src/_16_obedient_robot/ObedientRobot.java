package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	  Robot rob = new Robot();
	 
	
	
	void drawSquare() {
		for(int i = 0; i<4; i++) {
		rob.setSpeed(10);
		rob.penDown();
		rob.move(100);
		rob.turn(90);  
	  }
		rob.hide();
	}
	void drawTriangle() {
		for(int a = 0; a<3; a++) {
		rob.setSpeed(10);
		rob.penDown();
		rob.move(100);
		rob.turn(120);
		}
		rob.hide();
	}
	void drawCircle() {
		for(int b = 0; b<36; b++) {
		rob.setSpeed(100);
		rob.penDown();
		rob.move(10);
		rob.turn(10);	
		}
		rob.hide();
		
		
	}
	public static void main(String[] args) {
		ObedientRobot rob20 = new ObedientRobot();	
			rob20.start();	
		
		}
	void start() {
		String drawBoi = JOptionPane.showInputDialog(null, "What do you want to draw? (Square, Circle, Triangle)");
		String colorBoi = JOptionPane.showInputDialog(null,"What color do you want it to be? (Blue, Green, Red, Orange,");
		
		if(colorBoi.equalsIgnoreCase("Blue")) {
		rob.setPenColor(20,20,255);
		}else if(colorBoi.equalsIgnoreCase("Green")) {
		rob.setPenColor(20,255,20);
		}else if(colorBoi.equalsIgnoreCase("Red")) {
		rob.setPenColor(255,20,20);
		}else if(colorBoi.equalsIgnoreCase("Yellow")){
		rob.setPenColor(255,255,0);
		}else {
		rob.setPenColor(20,20,20);
		}
		
		
		if(drawBoi.equalsIgnoreCase("Square")) {
			             drawSquare();
		}else if(drawBoi.equalsIgnoreCase("Circle")) {
			drawCircle();
		}else if(drawBoi.equalsIgnoreCase("Triangle")){
			drawTriangle();
		}
		

		
		
		
		
	}
}
     