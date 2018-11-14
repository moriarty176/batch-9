package day_2_collections;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int [] [] groups = new int [2] [];
		groups[0] = new int[4];
		groups[1] = new int[3];
		
		groups[1][1] = 23;
		System.out.println(groups[1][1]);
		System.out.println(groups[0].length);
		System.out.println(groups[1].length);
	}
}
