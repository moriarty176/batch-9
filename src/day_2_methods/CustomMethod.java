package day_2_methods;

import java.util.Arrays;

public class CustomMethod {
	
	public static void main(String[] args) {
		sayHello();
		welcome("James");
		welcome("Adam");
		welcome("Obama");
		name("John", "Wick");
		String name = "josh";
		
//		Arrays.sort(a);
	}
	
	public static void welcome(String name) {
		System.out.println("Welcome, " + name);
	}
	
//	Create a method that takes a string and prints out
//	"Welcome, %givenName"
	

	public static void sayHello() {
		System.out.println("Hello");
		System.out.println("End of say hello method");
	}
	
//	Create a void method that takes two String arguments
//	that is firstname, lastname
//	And print "First: %firstname" "Last: %lastName"
	public static void name(String firstName, String lastName) {
		System.out.println("First: " + firstName);
		System.out.println("Last: " + lastName);
	}
}







