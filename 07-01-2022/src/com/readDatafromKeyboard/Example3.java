package com.readDatafromKeyboard;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter 1st Value:");
		num1 = scn.nextInt();
		System.out.println("Enter 2nd Value:");
		num2 = scn.nextInt();
		
		int sum = num1+num2;
		System.out.println(sum);
		scn.close();
		
	}

}
