package com.second;

import java.util.Scanner;

public class ExCalculator {

	public static void main(String[] args) {
		char operator;
		double num1,num2,result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("select an  operator : + ,-, *, /");
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the first number :");
		num1=sc.nextDouble();
		System.out.println("Enter the first number :");
		num2=sc.nextDouble();
		
		
		switch(operator)
		{
		case'+':
			result=num1+num2;
			System.out.println(num1 +"+" + num2 +"=" +result);
			break;
		case'-':
			result=num1-num2;
			System.out.println(num1 +"-" + num2 +"=" +result);
			break;
		case'*':
			result=num1*num2;
			System.out.println(num1 + "*" + num2 + "=" +result);
			break;
		case'/':
			result=num1/num2;
			System.out.println(num1 + "/" + num2 + "=" +result);
			break;
			
			default:
				System.out.println("Invalid Operator :");
				break;
		}
	}

}
