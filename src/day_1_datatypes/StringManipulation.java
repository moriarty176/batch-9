package day_1_datatypes;

public class StringManipulation {

	public static void main(String[] args) {
		String name = "james";
//	length of the strings.
//		String.length() --> method returns integer 
//		that is length of the given string
		System.out.println(name.length());
		int size = name.length();
//		charAt --> takes integer that is index and returns char 
//		that is character at given index. 
		char c = name.charAt(0);
		System.out.println(c);
//		indexOf --> takes string and return integer
//		that is index of given string. 
		int ii = name.indexOf("x");
		System.out.println(ii);
//		To cut string 
//		substring --> two options.
//		1. fromIndex to toIndex
//		2. from index. It cuts till the end of string.
		String school = "Cybertek";
		System.out.println(school.substring(0, 5));
		System.out.println(school.substring(5));
//		Immutable (not changeable)
//	
		System.out.println(school.indexOf("e", 4));
		System.out.println(school.isEmpty());
		System.out.println(school.trim());
		System.out.println(school.replace("e", ""));
		
		school = "hello";
		System.out.println(school);
		
		StringBuilder sb = new StringBuilder("James");
		sb.append("hello");
		System.out.println(sb);
		
		
	}
}










