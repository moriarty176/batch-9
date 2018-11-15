package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class Player {

	public static void main(String[] args) {
		Ball b1 = new Ball();
		b1.size = 5;
		b1.color = "Red";
		b1.date = "jan 1, 2000";
		Ball b2 = new Ball();
		b2.color = "White";
		b2.size = 7;
		b2.date = "Feb 2, 2017";
		Ball b3 = new Ball();
		b3.size = 12;
		b3.date = "March 3, 2019";
		b3.color = "Purple";
		System.out.println(b2.date);
		System.out.println(b2.color);
		b3.bounce();
		Ball.date = "Nov 11, 2018";
		
		b2.bounce();
		System.out.println(b1.date);
		List<Ball> myBalls = new ArrayList<>();
		myBalls.add(b1);
		myBalls.add(b2);
		myBalls.add(b3);
		
		Ball.countBallsByColor(myBalls, "purple");
		User.generateUsername("Elize");
	}
	
	
}
