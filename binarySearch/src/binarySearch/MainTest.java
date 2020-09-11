package binarySearch;

import java.util.Arrays;

public class MainTest {

	 public static void main(String[] args) {
		 
		 BinarySimple binarySimple = new BinarySimple();
		 int [] a = binarySimple.twoSum(new int[] {2,1,11,15}, 13);
		 System.out.println(Arrays.toString(a));
		
	 }
}
