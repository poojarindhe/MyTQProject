package com.StringDemo;

import java.util.Scanner;

public class FristOccurance 
{
	
	public static void main(String[] args) {
		String firstCharStr;
		int i = 0, flag = 0;
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter String to Find First Char Occur =  ");
		firstCharStr = sc.next();
		
		System.out.println("Enter the Character to Find =  ");
		 char ch = sc.next().charAt(0);
		
		while(i < firstCharStr.length())
		{
			if(firstCharStr.charAt(i) ==  ch) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0) {
			System.out.println("Sorry! We haven't found the Character ");
		}
		else {
			System.out.format("\nThe First Character Occurrence of %c at %d position", 
					ch, i);
		}
	}

}
