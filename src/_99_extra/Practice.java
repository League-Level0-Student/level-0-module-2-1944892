package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Ask the user for their favorite number that is less than 10.
//
//		2. Generate a random number that is less than 10.
//
//		3. If the random number is the same as the user's favorite number, show a pop-up that says "Bingo - we match!"
		
		
		
	String favorite =	JOptionPane.showInputDialog("What is your favorite number less than ten");
int favorite1 = Integer.parseInt(favorite);
		Random random1 = new Random();
		int random = random1.nextInt(11);
		
		
	}

}
