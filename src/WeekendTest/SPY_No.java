package WeekendTest;

import java.util.Scanner;
//ie:n=123=1+2+3=6;&1*2*3=6 sum==mul;
public class SPY_No {

	public static void main(String[] args) 
	{
     Scanner sc = new Scanner (System.in);
     System.out.println("enter the num :");
     int n=sc.nextInt();
     int sum=0;
     int mul=1;
     
     while(n>0)
     {
    	 int digit=n%10;
    	 sum=sum+digit;
    	 mul=mul*digit;
    	 n=n/10;
      }
     if(sum==mul)
     {
    	 System.out.println("num is spy ");
     }
     else
     {
    	 System.out.println("not spy num");
     }
    }

}
