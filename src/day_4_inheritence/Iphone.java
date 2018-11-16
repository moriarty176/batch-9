package day_4_inheritence;

public class Iphone {
	
	public Iphone(String colorInput, int memoryInput, String modelInput) {
		color = colorInput;
		memory = memoryInput;
		model = modelInput;
	}
	
	public Iphone(String color, String model) {
		this.model = model;
		this.color = color;
	}
	
	
	String color;
	int memory;
	String model;
	
	public void ring() {
		System.out.println(model + " is ringing");
	}
	
	public void call(String contactName) {
		System.out.println(model + " is calling to " + contactName);
	}
	
}
