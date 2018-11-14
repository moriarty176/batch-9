package day_2_collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter the number of ages:");
		int size = scan.nextInt();
		int []ages = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Please enter number " + (i+1));
			ages[i]  = scan.nextInt();
		}
		System.out.println("Size: " + ages.length);
		
		for(int age: ages) {
			System.out.println(age);
		}
		
		System.out.println(Arrays.toString(ages));
		
	}

}








