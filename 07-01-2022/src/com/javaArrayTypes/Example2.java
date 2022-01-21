package com.javaArrayTypes;

public class Example2 
{
	//single dimensional array in "multiple lines"
		public static void main(String[] args)
		{

	//declaration and instantiation ( An array object creation )
			int customerIds[] = new int[5];
			
	//initialization in "multiple lines"
			customerIds[0] = 2000;
			customerIds[1] = 2005;
			customerIds[2] = 2010;
			customerIds[3] = 3000;
			customerIds[4] = 3005;

			for(int i = 0; i < customerIds.length; i++)
			{
				System.out.println(customerIds[i]);
			}


		}


}
