package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		List<String> names = new ArrayList<>();
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Please enter name " + (i+1));
//			String name = scan.nextLine();
//			names.add(name);
//		}
//		
//		System.out.println(names);
//		getAges();
		List<String> people = new ArrayList<>();
		people.add("James");
		people.add("john");
		people.add("adam");
		people.add("Elize");
		people.add("josh");
		people.add("joshua");
//		System.out.println(people);
//		removeName(people, 4);
		List<Integer> nums = new ArrayList<>();
		nums.add(23);
		nums.add(12);
		nums.add(345);
		nums.add(345);
		nums.add(44);
		oddsAndEvens(nums);
		
	}
	
	public static void getAges() {
		Scanner scan = new Scanner(System.in);
		List<Integer> ages = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			System.out.println("Please enter the age " + (i+1));
			
			ages.add(scan.nextInt());
		}
		System.out.println(ages);
	}
	
	public static void removeName(List<String> names, int length) {
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).length() == length) {
				names.remove(i);
				i--;
			}
		}
		System.out.println(names);
	}
	
	public static void oddsAndEvens(List<Integer> numbers) {
		int evens = 0;
		int odds = 0;
		for(Integer num: numbers) {
			if(num % 2 == 0) {
				evens++;
			}
			else {
				odds++;
			}
		}
		System.out.println("Evens: " + evens);
		System.out.println("Odds: " + odds);
	}
}






