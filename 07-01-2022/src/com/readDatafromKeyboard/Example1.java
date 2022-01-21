package com.readDatafromKeyboard;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	
	{	
		String text;
		System.out.println("Enter the text");
		Scanner scn = new Scanner(System.in);
		text = scn.nextLine();
		System.out.println(text);
		scn.close();
	}

}


