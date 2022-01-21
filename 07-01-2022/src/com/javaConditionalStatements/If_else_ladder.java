package com.javaConditionalStatements;

import java.util.Scanner;

public class If_else_ladder 
{
	//if-else ladder
		public static void main(String[] args)
		{
			int marks;

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter your marks for 100: ");
			marks = scanner.nextInt();
			
			if(marks <= 100 && marks >= 70)
			{
				System.out.println("Distinction");
			}
			else if(marks < 70 && marks >= 60)
			{
				System.out.println("First class");
			}
			else if(marks < 60 && marks >= 50)
			{
				System.out.println("Second class");
			}
			else if(marks < 50 && marks >= 41)
			{
				
				System.out.println("Third class");
			}
			else if(marks == 40)
			{
				System.out.println("Just Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			scanner.close();
			
		}

}
