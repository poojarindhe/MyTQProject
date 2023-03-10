package com.logical;

import java.util.Scanner;

public class AvrageOfaDigits {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter binary num");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			count++;
			num= num/10;
		}
		int avr=(sum/count);
		System.out.println(avr);

	}

}
