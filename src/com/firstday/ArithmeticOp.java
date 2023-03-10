package com.firstday;

import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1 and num2");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		
		int add = num1+num2;
		System.out.println("Addition of two no is "+add);
		int sub = num1-num2;
		System.out.println("subtraction of two no is "+sub);
		int mul =num1*num2;
		System.out.println("Multiplication of two no is "+mul);
		int div = num1/num2;
		System.out.println("Division of two no is "+div);	
	}

}
