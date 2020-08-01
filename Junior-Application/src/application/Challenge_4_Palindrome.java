package application;

import java.util.Scanner;

public class Challenge_4_Palindrome {
	
	public static void isPalindrome(String str) { //reads in user input --> turns it lower case --> reverses it --> checks if its a palindrome
		String newStr = str.toLowerCase(); //creates new lower case version of input 
		String revStr = reverser(newStr); //initiates reverser method 
		if(newStr.equals(revStr)) { //checks if newStr and revStr are the same
			System.out.println(str + " is a palindrome!");
		}
		else { 
			System.out.println(str + " is not a palindrome!");

		}
		
		//Sadly couldn't solve it in one line :( 
	}	
	
	
	public static String reverser(String str) { //creates reverse of inputed string 
		String revStr = new String(); 
		for (int i = str.length()-1; i >= 0; i--) { 
			revStr += str.charAt(i);
		}
		return revStr; 
	}
	
	
	
	public static void main(String[] args) {
		//prompts user to input word 
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = in.next(); //reads string inputed by user
		isPalindrome(str); //initiates palindrome class 
	}

}
