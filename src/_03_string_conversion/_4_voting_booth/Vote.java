package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Vote {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are u?");	
	int age1 = Integer.parseInt(age);
	if (age1 > 18) {
	JOptionPane.showInputDialog("Who should be the next president?");
	if (age1 < 18) {
	JOptionPane	.showMessageDialog(null, "Nobody cares about u");
	}		
}
}
}