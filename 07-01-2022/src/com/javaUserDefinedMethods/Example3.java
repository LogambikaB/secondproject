package com.javaUserDefinedMethods;

public class Example3
{

	//user defined method
	
		//user defined method definition
			public static String getMessage1(String text)//text parameter(local variable)
			{
				return text;
			}
		// main method is predefined method
			public static void main(String[] args)
			{
				String text = getMessage1(" Happy New Year 2022 ");
				
				System.out.println(text);
				
			}

}
