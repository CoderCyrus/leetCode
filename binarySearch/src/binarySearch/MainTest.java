package binarySearch;

import java.util.Arrays;

public class MainTest {

	 public static void main(String[] args) {
		 
//		 BinarySimple binarySimple = new BinarySimple();
//		 int [] a = binarySimple.twoSum(new int[] {2,1,11,15}, 13);
//		 
//		 TwoPassHashTable twopashhash = new TwoPassHashTable();
//		 int []  b = twopashhash.twoSum(new int[] {2,1,11,15},17);
		 
		 OnePassHashTable onePassHashTable= new OnePassHashTable();
		 int [] c = onePassHashTable.twosum(new int[]  {2,1,11,15},17);
		 System.out.println(Arrays.toString(c));
		
	 }
}
