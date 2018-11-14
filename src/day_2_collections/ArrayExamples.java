package day_2_collections;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		String [] students = new String[5];
//		size of students is 5. It cannot be changed anymore
//		students can only store String type
//		to assign or get elements from students we use indexes. 
		students[1] = "James";
		students[0] = "Adam";
//		students[5] = "Elize";
		System.out.println(Arrays.toString(students));
		System.out.println("Size: " + students.length);
		
		String [] [] schoolGroups = new String[3][];
	}
}
