package day_4_inheritence;

public class CybertekStudent {
	
	int batchNumber;
	String name;
	int age;

	private void study() {
		System.out.println("Cybertek Student is studying");
	}
	
	public void code() {
		System.out.println("Cybertek Student is coding");
	}
	
	public void code(int hours) {
		System.out.println("Cybertek Student is coding " + hours + " hours");
	}
	
}
