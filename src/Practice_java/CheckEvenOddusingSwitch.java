package Practice_java;

import java.util.Scanner;

public class CheckEvenOddusingSwitch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=sc.nextInt();
		
		switch(num%2)
		{
		case 0: System.out.println(num+" is a Even num :");
		break;
		case 1:System.out.println(num+ " is a odd num ");
		break;
		
		}
		
	}

}
