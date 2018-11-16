package day_4_inheritence;

public class Driver {

	public static void main(String[] args) {
		Toyota t = new Toyota();
		t.setModel("Rav 4");
		t.setMileage(-12);
		
		System.out.println(t.getMileage());
		
		Nokia n = new Nokia("Black", false);
		n.takePicture();
		
	}
}
