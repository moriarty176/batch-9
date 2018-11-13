package day_1_datatypes;

public class NestedStuff {

	public static void main(String[] args) {
//		Nested  if else statements 
//		using if else statement in another if else statement.
		
		String name = "James";
		int age = 26;
		if(name.equals("James")) {
			if(age == 22) {
				System.out.println("James is 22 years old");
			}
			else {
				System.out.println("James but not 22");
			}
		}
		else {
			System.out.println("Not james");
		}
	}
}
