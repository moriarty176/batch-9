package day_3_custom_classes;

import java.util.List;

public class Ball {

	String color;
	int size;
	static String date;
	static int totalBalls;
	
	
	public void bounce() {
		System.out.println(color + " color " + size + " size ball is bouncing");
	}
	
	/**
	 * This method takes list of balls and counts number of
	 * balls by given target color
	 * @param balls
	 * @param color
	 */
	public static void countBallsByColor(List<Ball> balls, String color) {
		int count = 0;
		for(Ball ball: balls) {
			if(ball.color.equalsIgnoreCase(color)) {
				count++;
			}
		}
		System.out.println(color + " color balls: " + count);
	}

	
}
