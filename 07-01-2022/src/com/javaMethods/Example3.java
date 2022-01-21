package com.javaMethods;

import java.util.Scanner;

		/**
		 * WAP for calculator(sum, sub, product, division and modulo)
		 * Using methods, Scanner class and switch-case
		 */

public class Example3 
{	
	//step1: declare and initialize variables
		static int value1 = 500, value2 = 100, sum, sub, product, division, mod;
		
		//sum
			public static void sum1()
			{		
				sum = value1+value2;
				System.out.println("Sum: "+sum);
			}
		
		//sub
			public static void sub1()
			{		
				sub = value1-value2;
				System.out.println("Subtraction: "+sub);
			}
		
		//product
			public static void product1()
			{		
				product = value1*value2;
				System.out.println("Product: "+product);
			}
		
		//division
			public static void division1()
			{		
				division = value1/value2;
				System.out.println("Division: "+division);
			}
		
		//modulo
			public static void mod1()
			{		
				mod = value1%value2;
				System.out.println("Modulo: "+mod);
			}

	
	// main method
		public static void main(String[] args) 
		{
	
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Calculator Menu: \n");
			System.out.println("1.Sum");
			System.out.println("2.Subtraction");
			System.out.println("3.Product");
			System.out.println("4.Division");
			System.out.println("5.Mod\n");
			
			
			System.out.println("Select your operation: ");
			int operator = scanner.nextInt();
			
			switch(operator)
			{
				case 1:
					sum1();
					break;
				
				case 2:
					sub1();
					break;
				
				case 3:
					product1();
					break;
					
				case 4:
					division1();
					break;
					
				case 5:
					mod1();
					break;
				
				default:
					System.out.println("Select a valid operation...!");
			}
			
			scanner.close();
			
		}

}
