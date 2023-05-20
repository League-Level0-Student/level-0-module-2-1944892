//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {


		// 2. Get the user to enter a question for the 8 ball to answer
		String question = JOptionPane.showInputDialog("Enter a question !!!");

		// 3. Make a variable and initialize it to a random number.
		//     ** You will need to make a random object!
		//     Limit the random numbers to be between 0 and 3

		Random ran2 = new Random();
		int eightball = ran2.nextInt(4);
		// 4. If the random number is 0
		if(eightball == 0) {


			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null,"yes" );
		}
		// 5. If the random number is 1
		if(eightball == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null,"no" );
		}
		// 6. If the random number is 2
		if(eightball == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null,"Ask Google" );
		}
		// 7. If the random number is 3
		if(eightball == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null,"Who knows" );
		}
	}
}


