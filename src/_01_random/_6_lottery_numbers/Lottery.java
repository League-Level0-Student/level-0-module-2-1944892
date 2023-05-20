package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	Random ran = new Random();

	int lottery = ran.nextInt(100);
	int lottery1 = ran.nextInt(100);
	int lottery2 = ran.nextInt(100);
	int lottery3 = ran.nextInt(100);
	int lottery4 = ran.nextInt(100);
	int lottery5 = ran.nextInt(100);
	
JOptionPane.showMessageDialog(null,lottery +" "+lottery1+" "+ lottery2+" "+lottery3+" "+ lottery4+" "+ lottery5  );
}
}