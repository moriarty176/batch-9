package day_3_custom_classes;

import java.util.Random;

public class User {

	public static void generateUsername(String name) {
		Random r = new Random();
		int i = r.nextInt(1000);
		name = name + i;
		System.out.println("Your username: " + name.toLowerCase());
	}
}
