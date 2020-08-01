package application;

import java.util.Scanner;

public class Challenge_2_Calculator {
	public static void tamidCalculator() {
		//creates scanner and begins program 
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the TAMID Calculator!");
		System.out.println("Would you like to calculate something (y/n): ");
		String choice = in.next();
		while(choice.equals("y")) {  //while the user is entering yes (y) 
			//inputs --> first number, second number, and function type
			System.out.println("Please enter the first number: ");
			double first = in.nextInt();
			System.out.println("Please enter the second number: ");
			double second = in.nextInt();
			System.out.println("Please enter your function: ");
			String function = in.next();
			
			functionFinder(function, first, second); //calls switch/case function to choose function type
			
			System.out.println("Would you like to calculate something (y/n): ");
			choice = in.next();
		}
		
		System.out.println("Thanks for coming!");
	}
	
	public static void functionFinder(String function, double first, double second) {
		//where output will be delivered 
		switch(function) {
		case "+": 
			System.out.println(first + second); break;
		case "-": 
			System.out.println(first - second); break; 
		case "*":
			System.out.println(first * second); break;
		case "%": 
			System.out.println(first % second); break;
		case "/":
			if(second == 0) {  // checks to make sure user is not dividing by 0
				System.out.println("You cannot divide by 0!"); break;
			}
			else { 
				System.out.println(first/second); break;
			}
		default:  //checks to make sure user is not entering inputs that do not match calculator
			System.out.println("Could not find a function which matches your input"); break;
	
	}
	}
	
	
	public static void main(String[] args) {  
		tamidCalculator();
	}

}
