package com.javaMethods;

		/**
		 * WAP for calculator(sum, sub, product, division and modulo)
		 * Using Methods...
		 */

		public class Example2
		{
			//step1: declare and initialize variables
				static int value1 = 500, value2 = 100, sum, sub, product, division, mod;

			//sum
				public static void sum1() // sum1() is a method name
				{		
					sum = value1+value2;
					System.out.println("Sum: "+sum);
				}

			//sub
				public static void sub1() // sub1() is a method name
				{		
					sub = value1-value2;
					System.out.println("Subtraction: "+sub);
				}

			//product
				public static void product1() // product1() is a method name
				{		
					product = value1*value2;
					System.out.println("Product: "+product);
				}

			//division
				public static void division1() // division1() is a method name
				{		
					division = value1/value2;
					System.out.println("Division: "+division);
				}

			//modulo
				public static void mod1() // mod1() is a method name
				{		
					mod = value1%value2;
					System.out.println("Modulo: "+mod);
				}

			//main method
				public static void main(String[] args)
				{
					sum1();
					sub1();
					product1();
					division1();
					mod1();
					
				}
				

		}

	


