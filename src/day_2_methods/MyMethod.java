package day_2_methods;

import java.util.ArrayList;
import java.util.List;

public class MyMethod {
	
	
	public static void main(String[] args) {
		String name = "James";
		int i = name.indexOf("m");
		System.out.println(i);
		List<String> names = new ArrayList<>();
		names.add("Adam");
		
		int ii = indexOf("mm");
		System.out.println(ii);
	}
	
	public static int indexOf(String str) {
		return 10;
	}

}
