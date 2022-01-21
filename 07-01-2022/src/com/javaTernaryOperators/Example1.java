package com.javaTernaryOperators;

public class Example1 
{
	
		public static void main(String[] args)
		{
			//Ternary operator
			
			int age = 20;
			
			boolean condition = (age >= 18);
			
			System.out.println("Age is: "+age);
			System.out.println(condition);
			System.out.println("Age is: "+age +condition); /*possibility of getting the output by adding (+)concatenation operator 
																in single line */ 
			String major = "He/She is Eligible for Voting";
			String minor = "He/She is not Eligible for Voting";
			
			System.out.println(condition ? major : minor);
			
		}

	

}
