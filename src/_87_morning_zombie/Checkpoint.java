package _87_morning_zombie;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	
	String Color = JOptionPane.showInputDialog("What is your favorite color?");
	
	JOptionPane.showMessageDialog(null, "My favorite color is also" + Color );
	
	Robot Karan = new Robot();

	Karan.penDown();

	Karan.setSpeed(1000000000);
	Karan.move(90);
	
	Karan.turn(120);
	
	Karan.move(90);
	
	Karan.turn(120);

	Karan.move(90);

	Karan.turn(120);

}
}
