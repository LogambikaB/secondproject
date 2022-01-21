package com.javaBinaryOperators;

public class Bitwise_Operator
{
	//Bitwise Operators 

		public static void main(String[] args)
		{	
			int a, b;
			
			a = 10;
			b = 5;

			System.out.println("&: "+(a & b));

			System.out.println("|: "+(a | b));	
			
			/**		....8421
			 * 		00001010   a = 10 [8+2]
			 * &	00000101   b = 5 [4+1]
			 * -----------------
			 * 		00000000 - 0
			 * -----------------
			 * 		00001010   a = 10 [8+2]
			 * |	00000101   b = 5 [4+1]
			 * -------------------
			 * 		00001111 - 15   [8+4+2+1]
			 * -------------------
			 */
			
			System.out.println("################################");
			
			a = 8;
			b = 3;

			System.out.println("&: "+(a & b));

			System.out.println("|: "+(a | b));	
			
			/**
			 * 		00001000
			 * &	00000011
			 * -----------------
			 * 		00000000 - 0
			 * -----------------
			 * 		00001000
			 * |	00000011
			 * -------------------
			 * 		00001011 - 11
			 * -------------------
			 */

		}


}
