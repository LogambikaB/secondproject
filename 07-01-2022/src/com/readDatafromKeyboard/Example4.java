package com.readDatafromKeyboard;

import java.util.Scanner;

// WAP about the Student details by including (Name, Age, Address, Contact) using input statement    

public class Example4 
{

	public static void main(String[] args) 
	{
		String name, add;
		int age;
		
		System.out.println("Enter name");
		Scanner scn = new Scanner(System.in);
		name=scn.nextLine();
		
		System.out.println("Enter age");
		age=scn.nextInt();
		
//		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter the address");
//		add=scn1.nextLine();
		add=scn.next();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+add);
		
		scn.close();
		
		
	}

}

