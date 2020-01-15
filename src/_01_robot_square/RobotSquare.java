package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot Steve = new Robot();

        // 3. Put the robot's pen down
Steve.penDown();

        // 6. Make the robot move as fast as possible
Steve.setSpeed(10);

        // 5. Do everything below here 4 times
for (int i = 0; i < 1; i++) {
	
}
	https://github.com/League-Level0-Student/level-0-module-0-karanmandelasems.git
        //         2. Move your robot 200 pixels
Steve.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
	Steve.turn(180);

Steve.move(100);

Steve.turn(320);

Steve.move(150);

Steve.turn(180);

Steve.move(150);

Steve.turn(90);

Steve.move(100);

Steve.penUp();

Steve.move(100);


    }
}
