package application;

import java.util.*;

public class Challenge_3_Boxed_Strings {
	
	public static void boxedStrings(List<String> unboxed) {
		int largest = largestValue(unboxed); //calls method which finds largest length of all of the strings 
		
		System.out.println(printer("*", largest+3)); // prints first  row using printer method 

		for(int i = 0; i < unboxed.size(); i++) { 
			String line = "* " + unboxed.get(i); //creates String --> first "*" in the row and adds corresponding String
			System.out.print(line); // prints String 
			
			//uses printer method to find how many spaces before final "*"
			String ender = printer(" ", (largest+1) - unboxed.get(i).length());
			System.out.println(ender); //prints ender 
			
		}
		
		System.out.println(printer("*", largest+3)); //prints last row (Line 10) 
		
	}
	
	public static String printer(String s, int distance) {  //accepts type of string and how many times to print it 
		String printed = new String();
		for(int i = 0; i < distance; i++) {
			printed += s;
		}
		printed += "*";
		return printed;
	}
	
	public static int largestValue(List<String> unboxed) {  //calculates longest length of Strings 
		int largest = 0; 
		for(int j = 0; j < unboxed.size(); j++) {  
			if (unboxed.get(j).length() >= largest) {
				largest = unboxed.get(j).length();
			}
		}
		return largest; 
 
		
	}
	
	public static void main(String[] args) {
		//test cases for boxed strings 
		List<String> unboxedTester = Arrays.asList("TAMID", "IS","THE","COOLEST");
		boxedStrings(unboxedTester);
		
		List<String> unboxedTester_2 = Arrays.asList("HEllO", "WORLD","HOW","ARE","YOU","?");
		boxedStrings(unboxedTester_2);
		
		List<String> unboxedTester_Reverse = Arrays.asList("LONGEST", "GOES","TO", "SHORT");
		boxedStrings(unboxedTester_Reverse);
	}

}
