package day_4_inheritence;

public class IphoneUser {
	
	public static void main(String[] args) {
		Iphone ip1 = new Iphone("Gold", 512, "Iphe 8 PLUS");
		
		ip1.ring();
		ip1.call("Steve");
		ip1.model = "nothing";
		ip1.call("Elize");
		
		Iphone i2 = new Iphone("White", "Iphone X");
		i2.call("Ronaldo");
		i2.memory = -200;
		System.out.println(i2.memory);
	}

}
