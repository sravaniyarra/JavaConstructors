package com.Methods;

import java.util.Scanner;

public class WeeklyTest3 {
	
	static Scanner sc = new Scanner(System.in);
	
	 WeeklyTest3 w = new WeeklyTest3();
	
	public void addition(int n1,int n2) { //instance method
		 
		int result = n1+n2;
		System.out.println("enter a number to subtract");
		int i = sc.nextInt();
		subtraction(result,i);
		
		
	}
	public void subtraction(int s1,int s2) { //instance method
		 
		int result = s1-s2;
		System.out.println("Result of subtract : "+result);
	}
	
	
	
	public static void main(String[] args) {
		
		WeeklyTest3 w1 = new WeeklyTest3();
		 
		System.out.println("Please enter two values to Addition : ");
		int x = sc.nextInt();
		int y = sc.nextInt();		
		w1.addition(x,y);

	}

}
