package com.javaExpressions; 

import java.util.Scanner;

public class Expression_AreaofCircle
{

	public static void main(String[] args)  
	
	{
		/**
		 * 
		 * Write a java program to calculate the area of circle
		 * 
		 * Points:
		 * 
		 * 1. use variables area, radius and PI_VALUE = 3.14
		 * 
		 * 2. formula area = PI_VALUE*radius*radius
		 * 
		 * 3. print the area value
		 * 
		 * Note: use 'Scanner' class to read the values from keyboard.
		 * 
		 */

		double area, radius;
		final double pi = 3.14;
		
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		radius = scn1.nextDouble();
		
		area = pi*radius*radius;     // This is Expression
									//  Operators : = and *
									//  Operands ( variables & literals ) : area, pi and radius 
		
		System.out.println("Area of the Circle is: "+area);
		scn1.close();
		
	}	
		
				
	

}


