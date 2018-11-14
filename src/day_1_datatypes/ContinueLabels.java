package day_1_datatypes;

public class ContinueLabels {

	public static void main(String[] args) {
//		print all the numbers from 10 - 100
//		Skip the numbers that ends with 3
		firstLoop:
		for(int i = 10; i <= 100; i++) {
			secondLoop:
			for(int j = 10; j <= 50; j++) {
				System.out.println("i: " + i + " j: " + j);
				if(i == 23 && j == 30) {
					break firstLoop;
				}
			}
		}
	}
}
