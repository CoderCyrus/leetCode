public class FindMax {

	   /** @return the largest number of the given array */
	static int findLargest(int[] numbers) { 
		int result = 0;
	    for(int i = 0; i < numbers.length ; i++){
	    
	      if(result < numbers[i] ){
	        result = numbers[i];
	      }
	      
	}
	    // Your code goes here
	    return result;
	    
	   
	  }

	  public static void main(String[] args) {
		 FindMax test =new FindMax();
	    System.out.println(test.findLargest(new int[] {4,1,2,3}));
	  }
}
