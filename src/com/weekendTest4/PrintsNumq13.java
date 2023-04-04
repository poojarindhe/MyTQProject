package com.weekendTest4;

public class PrintsNumq13
{
	public static void main(String[] args)
	{
		  int buzzCount = 0;
	        int fizzCount = 0;
	        int buzzfizzCount = 0;
	        
	        for (int i = 1; i <= 50; i++)
	        {
	            if (i % 3 == 0 && i % 5 == 0)
	            {
	                System.out.println("buzzfizz");
	                buzzfizzCount++;
	            } 
	            else if (i % 3 == 0)
	            {
	                System.out.println("buzz");
	                buzzCount++;
	            } 
	            else if (i % 5 == 0)
	            {
	                System.out.println("fizz");
	                fizzCount++;
	            }
	            else 
	            {
	                System.out.println(i);
	            }
	        }
	        
	        System.out.println("buzz was printed " + buzzCount + " times");
	        System.out.println("fizz was printed " + fizzCount + " times");
	        System.out.println("buzzfizz was printed " + buzzfizzCount + " times");
	    }
	
	    
	}



