//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {


		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		for (int peepeepoopoo = 0; peepeepoopoo < 10; peepeepoopoo ++) {
			// 3. Find someone to test out your program. They will like it :)
			Random randomMaker = new Random();

			int randomNumber = randomMaker.nextInt(3); // 0 1 2
			if(randomNumber == 0) {
				// this runs if randomNUmber== 0

				JOptionPane.showMessageDialog(null,"YOU have a mom!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

			}
			if(randomNumber == 1) {
				JOptionPane.showMessageDialog(null,"YOU HAVE A LIFE!!!!!!!!!!!!!!!!!");
			}
			if(randomNumber == 2) {
				JOptionPane.showMessageDialog(null,"YOU CAN KILL!!!!!!!!!!!!!!!!");
			}
		}
	}
}
