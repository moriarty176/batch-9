package day_4_inheritence;

public class Parrot extends Bird {
//	Is-A relationship
//	Parrot is a Bird
	public Parrot() {
		
	}
	@Override
		public void fly() {
			System.out.println("Parrot is flying");
		}
	
	@Override
		public void eat() {
			System.out.println("Parrot is eating");
		}
	
	public Parrot(String type) {
		this.type = type;
	}
	
	public void talk() {
		System.out.println("Parrot is talking");
	}
}
