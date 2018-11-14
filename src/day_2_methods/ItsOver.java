package day_2_methods;

public class ItsOver {
	
	public static void main(String[] args) {
		String s = "james";
		s.substring(0, 2);
		s.substring(2);
		welcome();
		welcome("James");
//		ambiguity 
//		* Java shouldn't get confused which method to call. 
		welcome(987523);
	}
	
	public static void welcome() {
		System.out.println("Hey people, welcome");
	}
	
	public static void welcome(String name) {
		System.out.println("Welcome, " + name);
	}
	
	public static void welcome(int age) {
		System.out.println("Welcome, " + age + " age person");
	}
	
	

}
