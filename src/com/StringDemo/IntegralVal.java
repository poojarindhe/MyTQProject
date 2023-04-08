package com.StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class IntegralVal {

	public static void main(String[] args)
	{
		String  []s= {"A+1","D+3","B+7","E+1"};
		String s1=(Arrays.toString(s));
		//System.out.println(s1);
		/*
		 * String[] str=s1.split(" "); for(int i=0;i<str.length;i++) {
		 * System.out.println(str[i]); }
		 */
		
		
		//Scanner sc= new Scanner(System.in);
		//char ch= sc.next().charAt(0);
		
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		
		
		
		

	}

}
