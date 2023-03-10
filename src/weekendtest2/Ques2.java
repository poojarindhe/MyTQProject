package weekendtest2;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("x");
		int base=sc.nextInt();
		System.out.println("y");
		int expo=sc.nextInt();
		
		int power=1;
		
		for(int i=1;i<=expo;i++)
		{
			power=power*base;
		}
		System.out.println(power);
	}

}
