package day_4_inheritence;

public class BirdLovers {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.fly();
		p.eat();
		p.talk();
		AmazonParrot ap = new AmazonParrot();
		ap.eat();
	}
}
