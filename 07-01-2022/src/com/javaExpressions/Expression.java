package com.javaExpressions;

public class Expression 
{

	public static void main(String[] args) 
	
	{
		int expression = ( 100 + 56 - 13 % 5 + 16 / 4 + 5 % 2 );
		/* ( 100 + 56 - 13 % 5 + 16 / 4 + 5 % 2 ) 
		 * 						
		 * 	100 + 56 - 3 + 16 / 4 + 1
		 * 
		 * 	100 + 56 - 3 + 4 + 1
		 * 
		 * 	156 + 1 + 1
		 * 
		 * 	158
		 */
		System.out.println(expression);
		
		int a = 5;
		int expression2 = ( 17 - 8 / 4 * 2 + 3 - ++a );
		/*( 17 - 8 / 4 * 2 + 3 - ++a )
		 * 
		 * 17 - 2 * 2 + 3 - 6
		 * 
		 * 17 - 4 + 3 - 6
		 * 
		 * 11 - 1
		 * 
		 * 10
		 */
		System.out.println(expression2);
	}

}



