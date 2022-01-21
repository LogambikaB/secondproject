package com.javaArrays;

public class Example1 
{
	/**
	 * Array:  An array is a derived data type, it is used to store multiple values of 
	 * =====   similar or homogeneous data values/elements.
	 */
	
	public static void main(String[] args) 
	{
		
		/**
		 * WAP to print employee ages using java array.
		 */
		
		int employeeAges[] = {20, 25, 30, 32, 40};
		
		System.out.println("Number of elements present in an array: "+employeeAges.length);
		
		System.out.println("===================");
		
		//how to print values of an array
		
		/**
		 * Note: In java an array works based on index value concept, so array index starts from
		 *       zero(0) and ends with length-1 or size-1.
		 */
		
		for(int i = 0; i < employeeAges.length; i++)
		{
			System.out.println(employeeAges[i]);
		}
		
		System.out.println("===================");
		
		System.out.println(employeeAges[2]); // the value in 2nd place of the array is printed
		
	}
	
}
