package com.javaConditionalLoops;

public class Loop_for 
{

	public static void main(String[] args) 
	{
		/**
		 * for(initialization; condition; increment/decrement statement) 
		 * { 
		 * 		//print values 
		 * }
		 * 
		 */
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
		}
		
		/**
		 * for each loop [ given value is in array ]
		 */
		int employeeAges[] = {20, 23, 34, 18, 29};
		
		//for each loop
		for(int age: employeeAges)
		{
			System.out.println(age);
		}
		
	}
}


