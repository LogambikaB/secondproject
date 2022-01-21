package com.javaUnaryOperators;

public class Incremnt_Decremnt {

	public static void main(String[] args)
	{
		
			int num1 = 2, num2 = 4, num3 = 6, num4 = 8, exp1, exp2, exp3, exp4;
			
			exp1 = num1++;      // post-increment
			System.out.println("Value of exp1: "+exp1);
			
			exp2 = ++num2;      // pre-Increment
			System.out.println("Value of exp2: "+exp2);
			
			exp3 = num3--;     // post-decrement
			System.out.println("Value of exp3: "+exp3);
			
			exp4 = --num4;     // pre-decrement
			System.out.println("Value of exp4: "+exp4);
		
	}

}
