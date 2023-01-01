package Codes;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateChar {
	
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		String name = scan.next();
		
		System.out.println(name);
		
		HashSet<Character> charSet = new HashSet<Character>();
		
		for(char i : name.toCharArray()) {
			
			if(charSet.contains(i)) {
				
				
				System.out.println(i +"");
			}else
			{
				
			charSet.add(i);	
			}
			
			
			
		}
		
	}

}
