package com.readDatafromKeyboard;

import java.util.Scanner;

public class AreaofCircle 
{

	public static void main(String[] args) 
	
	{
		int radius;
        double pi, Area;
        
        System.out.println("pi = ");
        Scanner scn = new Scanner(System.in);
        pi=scn.nextDouble();
        System.out.println("Radius = ");
        radius=scn.nextInt();
        
        Area = pi * radius * radius;
        System.out.println("Area of the Circle = "+Area);
        
        scn.close();
		
	} 	
		
	
	
	      
	

}

