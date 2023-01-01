package Codes;

public class ToUppercaseAndLowercase {

	public static void main(String[] args) {
		
		
     String name = "Bhavdip Kakadiya Bhavdip kakadiya";
     
     int mid = name.length()/2;
     
     String upperCase = "";
     String lowerCase = "";
     
     for (int i =0; i<name.length(); i++ ) {
    	 
    	 
    	 if (i <mid) {
    		 
    		 upperCase = upperCase + Character.toUpperCase(name.charAt(i));
    		 
    		 
    	 }
    	 else 
    	 {
    		lowerCase = lowerCase+Character.toLowerCase(name.charAt(i)); 
    		
    		
    		 
    		 
    	 }
     }
     
     System.out.println("UpperCase : "+ upperCase);
     System.out.println("Lowercase :"+lowerCase);
		
	}
	
	
	
	
}
