package com.second;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char ch=sc.next().charAt(0);
		
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
        	System.out.println("It is a vowel");
        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
        	System.out.println("It is a vowel");
        }
        else
        {
        	System.out.println("It is a Consonant");
        }
		
		

	}

}
