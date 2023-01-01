package Codes;

import java.util.Scanner;

public class CountNumbers {

	
	public static void main(String[] args) {
		
		
		Scanner  scan= new Scanner(System.in);
		
		System.out.println("please enter the number!");
		
		int number = scan.nextInt();
		int counter = 0;
		
		while( number>0) {
			
			counter++;
			number = number/10;
		}
		
		System.out.println("Total digit for the given number is "+counter);
	}
	
	
}
