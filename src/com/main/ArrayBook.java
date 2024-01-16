package com.main;

public class ArrayBook {

	public static void main(String[] args) {
		
		int [] x = {24,35,11,75,89};
		int num = 5;
		
		for (int ele : x) {
			
			if(ele%5 == 0) {
				
				System.out.println("Number " +ele+ " is Prime");
				
			} else {
				
				System.out.println("Number " +ele+ " is not prime" );
			}
		}
	}
}
