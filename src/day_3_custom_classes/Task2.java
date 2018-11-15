package day_3_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		
		int i = 0;
		boolean check = true;
		do {
			System.out.println("Please enter name " + (++i));
			String name = scan.nextLine();
			names.add(name);
			System.out.println("Do you want to continue?yes/no");
			String response = scan.nextLine();
			if(response.equalsIgnoreCase("no")) {
				check = false;
			}
			 
		}while(check);
		System.out.println(names);
	}

}
