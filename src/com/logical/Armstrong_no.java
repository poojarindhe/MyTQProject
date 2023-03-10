package com.logical;

import java.util.Scanner;
//Armstrong no is=153=1*1*1+5*5*5+3*3*3=153
public class Armstrong_no {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		int r=0;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is not Armstrong");
		}
		
	}

}
