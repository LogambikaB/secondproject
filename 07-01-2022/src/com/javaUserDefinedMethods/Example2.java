package com.javaUserDefinedMethods;

public class Example2 
{
	
	//user defined method
	
		//user defined method definition
			public static void getMessage(String text)//text parameter(local variable)
			{
				//method body or method implementation
				System.out.println(text);
			}
			
			public static String getMessage1(String text)//text parameter(local variable)
			{
				return text;
			}
		
		//main method is predefined method
			public static void main(String[] args)
			{
				//calling user defined method
				getMessage("How are you?");//calling method by passing arguments/values
				
				System.out.println(getMessage1("I'm Good & Hope the same from you"));
			}

}
