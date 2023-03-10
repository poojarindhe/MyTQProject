package com.logical;

import java.util.Scanner;
//palindrome no 454=454;
public class Palindrome_no {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sum=0;
		int temp;
		int r;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		
		if(temp==sum)
		{
		System.out.println("Palindrome no is" );
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}

}
