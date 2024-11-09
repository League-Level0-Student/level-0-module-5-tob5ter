package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientAI {
	Robot rob = new Robot ("mini");
	public static void main(String[] args) {
		ObedientAI ai = new ObedientAI();
		ai.drawSquare();
		ai.drawCircle();
		ai.drawHexagon();
	}
	public void drawSquare() {
		
		rob.setX(100);
		rob.setY(500);

		rob.penDown();

		rob.setSpeed(20);

		rob.setPenColor(0,0,0);
		for(int i=0;i<4;i++) {
			rob.move(50);
			rob.turn(90);
		}
	}
	public void drawCircle() {
		
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(500);
		rob.move(100);
		for(int pi=0;pi<36;pi++) {
			rob.move(20);
			rob.turn(10);
		}
	}
	public void drawHexagon() {
		rob.setX(100);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(50);
		rob.move(200);
		for(int pi=0;pi<6;pi++) {
			rob.move(40);
			rob.turn(60);
		}
	}
}
