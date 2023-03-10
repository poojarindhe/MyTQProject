package WeekendTest;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args)
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter two numbres :");
		 int n1=sc.nextInt();
		 int n2=sc.nextInt();
		 int ct1=0;
		 int ct2=0;
		  
		 for(int i=2;i<n1;i++)
		 {
			 if(n1%i==0)
			 {
				 ct1++;
			 }
			// System.out.println(ct1);
		 }
		 

		 for(int i=2;i<n2;i++)
		 {
			 if(n2%i==0)
			 {
				ct2++; 
			 }
			//System.out.println(ct2);
		 }
		 
		 int d=n1-n2;
		 if(ct1==0 && ct2==0 && (d==2 || d==-2))
		 {
			 System.out.println("Twin prime number");
		 }
		 else
		 {
			 System.out.println("not twin prime");
		 }

	}

}
