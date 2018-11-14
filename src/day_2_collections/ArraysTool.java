package day_2_collections;

import java.util.Arrays;

public class ArraysTool {
	
	public static void main(String[] args) {
		int [] nums = {34,23,5,2,65,1};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] names = {"Elize", "John", "Adam"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		System.out.println(Arrays.toString(names));
		
		System.out.println("60:"+Arrays.binarySearch(nums, 60));
		
		System.out.println(Arrays.binarySearch(names, "John"));
		
//		
	}

}









