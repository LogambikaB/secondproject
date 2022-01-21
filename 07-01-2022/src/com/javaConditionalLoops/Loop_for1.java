package com.javaConditionalLoops;

import java.util.Scanner;

public class Loop_for1 {

	public static void main(String[] args) 
	{
		int start, end;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the starting value: ");
		start = scn.nextInt();
		
		System.out.println("Enter the ending value: ");
		end = scn.nextInt();
		
		for(int j = start; j <= end; j++)
		{
			System.out.println(j);
		}
		
		scn.close();
		
	}

}

