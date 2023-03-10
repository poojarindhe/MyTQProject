package Practice_java;

import java.util.Scanner;

public class Table_no {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of table");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			
		
        System.out.println(num*i);
	}
		}

}
