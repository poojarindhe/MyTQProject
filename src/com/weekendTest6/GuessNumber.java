package com.weekendTest6;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
	int key=4;
	int guess;
	int count=0;
	Scanner sc= new Scanner (System.in);
	do
	{
		System.out.println("Enter single digit number");
		guess=sc.nextInt();
		count++;
		if(guess==key)
		{
			System.out.println("Guess the correct num :" +count);
		}
		else
		{
			System.out.println("sry!!Thats not correct number");
		}
	}while(guess!=key);
		
	}
	

	}


