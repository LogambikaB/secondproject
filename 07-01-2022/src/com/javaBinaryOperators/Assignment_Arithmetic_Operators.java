package com.javaBinaryOperators;

public class Assignment_Arithmetic_Operators 
{

		public static void main(String[] args)
		{
			//Assignment Arithmetic Operators
			int a = 100;//100
			int b = 10;

			System.out.println("+=: "+(a += b));//110
			
			/**
			 *  a += b 
			 *  => a = a+b
			 *  => a = 100+10
			 *  => a = 110  
			 */
			
			System.out.println("-=: "+(a -= b));//100
			/**
			 *  a -= b 
			 *  => a = a-b
			 *  => a = 110-10
			 *  => a = 100  
			 */		
			System.out.println("*=: "+(a *= b));//1000
			/**
			 *  a *= b 
			 *  => a = a*b
			 *  => a = 100*10
			 *  => a = 1000  
			 */	
			
			System.out.println("/=: "+(a /= b));//100
			/**
			 *  a /= b 
			 *  => a = a/b
			 *  => a = 1000/10
			 *  => a = 100  
			 */	
			System.out.println("%=: "+(a %= b));//0
			/**
			 *  a %= b 
			 *  => a = a%b
			 *  => a = 100%10
			 *  => a = 0  
			 */	
			
			/*
			 * +: 110 
			 * -: 90 
			 * *: 1000 
			 * /: 10 
			 * %: 0
			 * 
			 */

			
		}


}


