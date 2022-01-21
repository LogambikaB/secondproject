package com.javaArrayTypes;

/**
 *   MultiDimensional Array: 
 *
 */

public class Example4 
{

	//MultiDimensional Array in multiple lines
		public static void main(String[] args)
		{

	//declaration and instantiation(An array object creation)
		int customerIds[][] = new int[3][3];
		
	//initialization
		customerIds[0][0] = 2000;
		customerIds[0][1] = 2005;
		customerIds[0][2] = 2010;
		
		customerIds[1][0] = 2015;
		customerIds[1][1] = 2020;
		customerIds[1][2] = 2025;
		
		customerIds[2][0] = 2030;
		customerIds[2][1] = 2035;
		customerIds[2][2] = 2040;

		for(int i = 0; i < customerIds.length; i++)
		{
			for(int j = 0; j < customerIds.length; j++)
			{
				System.out.println(customerIds[i][j]);
			}
		}
		
		System.out.println("===================");
		
		for(int i = 0; i < customerIds.length; i++)
		{
			for(int j = 0; j < customerIds.length; j++)
			{
				System.out.print(customerIds[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}

}
