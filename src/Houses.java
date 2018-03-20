import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static int up = 100;
	static int side = 40;
	static Robot rob = new Robot();
	static int a = new Random().nextInt(10) + 50;
	public static void main(String[] args) {
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(2);
		rob.moveTo(60, 500);
		for (int i = 0; i < 10; i++) {
			int random = new Random().nextInt(3);
			if (random == 0) {
				drawHouse("small");
			} else if (random == 1) {
				drawHouse("medium");
			} else if (random == 2) {
				drawHouse("large");
			}
			drawGrass();
		}
	}

	public static void drawHouse(String up) {
		int size = 0;
		if (up.equalsIgnoreCase("small")) {
			size = 60;
		} else if (up.equalsIgnoreCase("medium")) {
			size = 120;
		} else if (up.equalsIgnoreCase("large")) {
			size = 250;
		}
		rob.setAngle(0);
		rob.setPenColor(a, a * 2, a + a * a);
		rob.move(size);
		rob.turn(90);
		rob.move(side);
		rob.turn(90);
		rob.move(size);
	}

	public static void drawGrass() {
		rob.setPenColor(39, 174, 96);
		rob.turn(-90);
		rob.move(40);
	}
}
