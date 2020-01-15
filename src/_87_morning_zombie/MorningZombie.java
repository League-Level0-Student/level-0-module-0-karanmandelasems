package _87_morning_zombie;

import javax.swing.JOptionPane;

public class MorningZombie {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"What is your name?");

	String name=JOptionPane.showInputDialog(null, "Type in your best insult");
	JOptionPane.showMessageDialog(null, "HI,  "+name);
	String insult=JOptionPane.showInputDialog(null, "Type in an insult you would tell your friend and tell it to me.");
	JOptionPane.showMessageDialog(null, "Hi, " +insult);
	String another=JOptionPane.showInputDialog(null, "If you haven't guessed, this is an insult battle. Type in another one. I promise I won't repeat back");
	JOptionPane.showMessageDialog(null, "Hi, " +another);
	
}
}
