package com.javaMethods;

public class Example1 
{

	public static void main(String[] args)  // main method
	{
		/**
		 * WAP for calculator(sum, sub, product, division and modulo).
		 */

		//step1: declare and initialize variables
			int num1 = 500, num2 = 100, sum, sub, product, division, mod;

		//sum
			sum = num1+num2;
			System.out.println(sum);

		//sub
			sub = num1-num2;
			System.out.println(sub);

		//product
			product = num1*num2;
			System.out.println(product);

		//division
			division = num1/num2;
			System.out.println(division);

		//mod
			mod = num1%num2;
			System.out.println(mod);

	}

}
