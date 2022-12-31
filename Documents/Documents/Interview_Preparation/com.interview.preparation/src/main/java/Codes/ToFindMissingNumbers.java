package Codes;



public class ToFindMissingNumbers {
	
	public static void main(String[] args) {
		
		int  array[] = new int[] {1,2,3,4,5,6,8,9,10};
		
		int sum = (10*11)/2;
		
		System.out.println("Ideal sum : "+ sum);
		
		int actualSum = 0;
		
	 for(int i =0; i<array.length; i++) {
		
		 actualSum = actualSum+array[i];
		 
		 
		
		 
	 
	 
	 }
	 System.out.println("actual sum : " + actualSum);
		 int missingNumber   = sum - actualSum;
		 
		 System.out.println("Missing number is "+ missingNumber);
		 
	 
		
		
		
	}

}
