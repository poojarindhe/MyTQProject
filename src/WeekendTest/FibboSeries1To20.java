package WeekendTest;

import java.util.Scanner;

public class FibboSeries1To20 {

	public static void main(String[] args)
	{
		int n1=1,n2=2,n3,i;
		
		
		System.out.print(n1+" "+n2);
		
		for(i=2;i<20;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
