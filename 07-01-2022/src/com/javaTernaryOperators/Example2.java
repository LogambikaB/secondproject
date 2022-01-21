package com.javaTernaryOperators;

public class Example2 
{

		public static void main(String[] args)
		{
			//Ternary operator
			
			int num = -25;
			
			boolean condition = (num > 0);
			
			System.out.println(condition);
			
			String positive = "The given Number is Positive";
			String negative = "The given Number is Negative";
			
			System.out.println(condition ? positive : negative);
		}
	
	
	
}
