package com.basics;

public class UnaryOperator {

	public static void main(String[] args) {
		 int a=4;
		 int b=4;
		 
		 int x = ++a  + b++;
		  System.out.println(x+" "+a+" "+b);
		  
		  x = a++ - b++ -a;
		 System.out.println(x+" "+a+" "+b);
		 
		  x= a-- + -- b - --a;
		 System.out.println(x+" "+a+" "+b);
		 
		 x= a + -- b - ++a;
		 System.out.println(x+" "+a+" "+b);
	}

}
