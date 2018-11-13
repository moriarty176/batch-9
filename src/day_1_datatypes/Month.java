package day_1_datatypes;

import java.util.Scanner;

public class Month {
	
	public static void main(StringManipulation[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number btw 1 - 12:");
		int num = scan.nextInt();
		if(num > 0 && num < 13) {
			switch(num) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			
			}
		}
		else {
			System.out.println("Invalid data");
		}
		
	}

}
