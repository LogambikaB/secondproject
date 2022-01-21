package com.javaBinaryOperators;

public class Logical_Operators 
{
	/*
	 * Logical Operators:
	 * 
	 * Note: these all operators generate result in the form of
	 *       boolean values(true/false)
	 */
	
	public static void main(String[] args)
	{

		int a = 500;
		int b = 100;
		
		boolean validate = (a >= b);//true

		System.out.println("&&: "+((a > b) && (a >= b)));//true
		
		System.out.println("||: "+((a < b) || (a >= b)));//true	
		
		System.out.println("!: "+ !validate);//false		
		
	}


}
