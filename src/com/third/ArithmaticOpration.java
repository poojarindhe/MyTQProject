package com.third;

public class ArithmaticOpration 
{
	    int add(int num1, int num2)
	    {
	        return num1+num2;
	    }
	    int sub(int p, int q)
	    {
	        return p-q;
	    }
	    int mul(int x,int y)
	    {
	        return x*y;
	    }
	    int div(float a,float b)
	    {
	    	return (int) (a/b);
	    }
	    public static void main(String[] args) 
	    {    
	    	ArithmaticOpration aa= new ArithmaticOpration();
	    	
	        System.out.println("Sum of two numbers: "+aa.add(10, 20));
	        
	        System.out.println("Subtraction of three numbers: "+aa.sub(10 , 5));
	        
	        System.out.println("multiplication of four numbers: "+aa.mul( 3, 4));
	        
	        System.out.println("Division of numbers :"+aa.div(9, 3));
	    }

}
