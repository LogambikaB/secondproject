package com.javaJumpingStatementwithLoop; 

public class Continue_statement
{
	//continue statement
	public static void main(String[] args) 
	{
		
		for(int i = 1; i <= 10; i++)
			{
				
				if(i == 5)
				{
					continue;		// continue statement [ will get "skip" from that particular part & proceed with the execution]
				}
				
				System.out.println(i);
			}
		
		System.out.println("######################");
		
	//continue statement	
		for(int i = 1; i <= 10; i++)
		{
			
			if(i == 7)
			{
				continue;			// continue statement [ will get "skip" from that particular part & proceed with the execution]
			}
			
			System.out.println(i);
		}
			
		}

				
	}




