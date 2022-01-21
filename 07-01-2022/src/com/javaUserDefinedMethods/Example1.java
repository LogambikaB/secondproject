package com.javaUserDefinedMethods;

public class Example1 
{

//user defined method
	
				/** Method syntax:-
				 * 
				 * modifiers return type name(parameters) --> method signature or method head
				 * { 
				 *   method body 
				 *       or
				 *   method implementation
				 * }  
				 * 
				 **/
	//user defined method definition
			public static void getMessage() //method signature or method head
			{
				//method body
				System.out.println("Hey Dude What's up?");
			}
		
	//main method is predefined method
			public static void main(String[] args)
			{
				//calling user defined method
				getMessage();
			}


}
