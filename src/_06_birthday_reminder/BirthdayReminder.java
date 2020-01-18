
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 13th";
		String dadsBirthday = "May 1st";
		String myBirthday = "February 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable 
		String person = JOptionPane.showInputDialog(null, "Who's birthday do you want to store! ( MOM, DAD, ME)");
		// 3. Print out what the user typed
		if(person.equalsIgnoreCase("MOM")) {
			System.out.println(momsBirthday);
			
		}else if(person.equalsIgnoreCase("DAD")) {
			System.out.println(dadsBirthday);
		}else if(person.equalsIgnoreCase("ME")){
			System.out.println(myBirthday); 
		}else {
			System.out.println("Sorry, I don't remember theat person's birthday.");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
