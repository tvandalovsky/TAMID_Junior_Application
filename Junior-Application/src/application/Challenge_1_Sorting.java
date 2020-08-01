package application;

import java.util.Arrays;

public class Challenge_1_Sorting {
	
	public static void sortArrays(int arr1[], int arr2[] ,int k) {
		int[] final_arr = new int[arr1.length + arr2.length];  //creates array with the length of both original arrays 
		
		//copies both arrays into final array and sorts them in numeric order 
		System.arraycopy(arr1, 0, final_arr, 0, arr1.length);   
		System.arraycopy(arr2, 0, final_arr, arr1.length, arr2.length);
		Arrays.sort(final_arr); 
		
		if(k > final_arr.length) { //checks if k is larger than length of array --> prints full array 
			System.out.println(Arrays.toString(final_arr)); 
		}
		
		else { //prints array up to index k
			System.out.println(Arrays.toString(Arrays.copyOfRange(final_arr,0,k)));
		}
		
		
	}
	
	public static void main(String[] args) {
		//test cases for sortArrays method
		int arr1[] = {1, 3, 5, 8};
		int arr2[] = {1, 2, 3};
		int a = 5;
		sortArrays(arr1, arr2, a);
		
		int arr3[] = {2, 8, 15, 30};
		int arr4[] = {1, 2, 3};
		int b = 2;
		sortArrays(arr3, arr4, b);
		
		int arr5[] = {1, 3, 5, 8};
		int arr6[] = {1, 2, 3};
		int c = 0;
		sortArrays(arr5, arr6, c);
		
		int arr7[] = {1, 3, 5, 8};
		int arr8[] = {};
		int d = 10;
		sortArrays(arr7, arr8, d);
		
	}


}
