package day_2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Adam");
		names.add("Elize");
		names.add(0, "Donald");
		System.out.println(names);
//		names.remove(1);
		System.out.println(names);
//		names.remove("Adam");
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.size());
		Collections.sort(names);
		System.out.println(names);
//		
//		String [] birds = {"bird 1", "some other type"};
//		
//		String [] newBirds = Arrays.copyOf(birds, 5);
//		System.out.println(Arrays.toString(newBirds));
		
		List<Integer> evens = new ArrayList<>();
		List<Integer> odds = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evens.add(i);
			}
			else {
				odds.add(i);
			}
		}
		System.out.println(evens);
		System.out.println(odds);
		
		
	}

}



