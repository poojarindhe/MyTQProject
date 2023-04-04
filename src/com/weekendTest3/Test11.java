package com.weekendTest3;

import java.util.Scanner;

public class Test11 {
	
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        double principal, rate, value1, value2, loan;

	        System.out.print("Enter the principal amount: ");
	        principal = input.nextDouble();

	        System.out.print("Enter the rate of interest: ");
	        rate = input.nextDouble();

	        if (rate >= 0)
	        {
	            loan = principal * (100 + rate) / 100;
	        } 
	        else 
	        {
	            System.out.print("Enter value 1: ");
	            value1 = input.nextDouble();

	            System.out.print("Enter value 2: ");
	            value2 = input.nextDouble();

	            loan = principal * (value1 + value2 + 100) / 100;
	        }

	        System.out.println("The loan amount is: " + loan);
	    }
	}



