package com.javaMethods;

import java.util.Scanner;

		/**
		 * Write a java program for calculator(sum, sub, product, division and modulo)
		 * Using methods, Scanner class, switch-case and while loop.
		 */

public class Example4 
{
		//step1: declare and initialize variables
		static int value1, value2, sum, sub, product, division, mod;
		
		static Scanner scanner = new Scanner(System.in);

		//sum
		public static void sum1()
		{	
			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			sum = value1+value2;
			System.out.println("Sum: "+sum);
		}

		//sub
		public static void sub1()
		{		
			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			sub = value1-value2;
			System.out.println("Substruction: "+sub);
		}

		//product
		public static void product1()
		{		
			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			product = value1*value2;
			System.out.println("Product: "+product);
		}

		//division
		public static void division1()
		{		
			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();

			division = value1/value2;
			System.out.println("Division: "+division);
		}

		//modulo
		public static void mod1()
		{		
			System.out.println("Enter First Value: ");
			value1 = scanner.nextInt();

			System.out.println("Enter Second Value: ");
			value2 = scanner.nextInt();
			
			mod = value1%value2;
			System.out.println("Mod: "+mod);
		}

		//main method
		public static void main(String[] args)
		{
			
			while(true)
			{
				System.out.println("Calculator Menu: \n");
				System.out.println("1.Sum");
				System.out.println("2.Subtraction");
				System.out.println("3.Product");
				System.out.println("4.Division");
				System.out.println("5.Mod");
				System.out.println("6.Stop\n");

				
				System.out.println("Select the choice of your operation: ");
				int operator = scanner.nextInt();

				switch(operator)
				{
				case 1:
					sum1();
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;

				case 2:
					sub1();
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;

				case 3:
					product1();
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;

				case 4:
					division1();
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;

				case 5:
					mod1();
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;
				
				case 6:
					System.exit(0);
					System.out.println("The Execution of the Program gets Stopped"); // As we used "System.exit();" 
					System.out.println("$$$$$$$$$$$$$$$$$$$");
					break;

				default:
					System.out.println("Select a valid operation...!");
					System.out.println("---------------------------");
				}

			}
			
		}

}


