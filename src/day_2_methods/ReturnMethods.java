package day_2_methods;

public class ReturnMethods {
	
	public static void main(String[] args) {
		int i = add(234,364);
		System.out.println(i);
		System.out.println(getLastChar(""));
//		System.out.println((getLastChar(""));
	}
	
//	Create a method that return last character
//	Method accepts string type and return char
//	special case:
	public static char getLastChar(String word) {
		if(word.isEmpty()) {
			return '\u0000';
		}
		return word.charAt(word.length()-1);
	}
	
	public static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public static int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

}
