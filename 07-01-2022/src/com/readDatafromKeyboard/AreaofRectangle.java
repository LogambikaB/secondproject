package com.readDatafromKeyboard;

import java.util.Scanner;

public class AreaofRectangle 
{

	public static void main(String[] args) 
	{
		int length,breadth;
		
		System.out.println("Length=");
		Scanner scn = new Scanner(System.in);
		length=scn.nextInt();
		System.out.println("Breadth=");
		breadth=scn.nextInt();
		
		int AOR = length*breadth;
		System.out.println("Area of Rectangle="+AOR);
	
		scn.close();
	
	}

}
