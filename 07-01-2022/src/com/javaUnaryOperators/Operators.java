package com.javaUnaryOperators;

public class Operators 
{

	public static void main(String[] args) 
	
	{	
		// Unary Operators - 1st Part
		
		int num1 = 100, num2 = 50, exp1, exp2;
		boolean exp3, exp4;
		
		exp1 = +num1;
		System.out.println("Value of exp1: "+exp1);
		
		exp2 = -num2;
		System.out.println("Value of exp2: "+exp2);
		
		exp3 = num1 > num2;
		System.out.println("Value of exp3: "+exp3);
		
		exp4 =  !exp3;
		System.out.println("Value of exp4: "+exp4);
		
			//Unary Operators - 2nd Part
		
		int a = 40;
		final int b = 60;
		int task1 = a++;
		int task2 = b;
		
		/*
		 * The final local variable a cannot be assigned. 
		 * It must be blank and not using a compound assignment
		 * Example: task2 = ++b or b++ or b-- or --b; ( Can't give like this. Since "final" keyword is used. )
		 */
		
		System.out.println(task1);
		System.out.println(task2);		

		
	}

}


