package com.patterns;

import java.util.Scanner;

public class PatternCharDemo4 {

	public static void main(String[] args) 
	{
		//Scanner sc =new Scanner (System.in);
		//System.out.println("Enter no of rows :");
		//int n= sc.nextInt();
		
		 for(char i='A';i<='D';i++)
		 {
			 for(char j='A';j<='D';j++)
			 {
				 if(i=='A'||i=='D'||j=='A'||j=='D')
				 {
					 System.out.print(j);
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
			 }
			 
			 
		 }
		

	}


