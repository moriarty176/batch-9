package day_1_datatypes;

public class MyLoops {
	
	public static void main(String[] args) {
//		int i = 43;
		String name = "bond";
//		System.out.println(i + name);
//		String s = i+"";
//		String str = String.valueOf(i);
		String ss  = "235";
		int  ii = Integer.valueOf(ss);
		System.out.println(ii);
		
		for(int k = 0; k < 10; k++) {
			int b = k+10;
			System.out.println("num: " + b);
		}
		System.out.println("anything");
		
		String n = "universe";
		String result = "";
		for(int i = n.length() - 1; i >= 0; i--) {
			result += n.charAt(i);
		}
		System.out.println(result);
		
		
	}

}







