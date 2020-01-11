package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	
	String q1 = JOptionPane.showInputDialog("Are you happy?") ;
	 if(q1.equalsIgnoreCase("Yes")) {
		 JOptionPane.showMessageDialog(null, "Keep doing watever you are doing.") ;
	 }
	 if(q1.equalsIgnoreCase("No")) {
		 String q2 = JOptionPane.showInputDialog(null, "Do you want to be happy?") ;
		 if(q2.equalsIgnoreCase("Yes")) {
			
		 JOptionPane.showMessageDialog(null, "Change something.") ;
		
		 }else {
			 JOptionPane.showMessageDialog(null, "Keep doing watever you are doing.") ;
					 
		 }
	 }
	 
	 
		}
}
