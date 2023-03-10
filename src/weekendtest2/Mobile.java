package weekendtest2;

import java.util.Scanner;

public class Mobile
{
	public static void main(String[] args)
	{
		
        Scanner sc=new Scanner(System.in);
        int i,count;
		long digit;
		long temp;
       
        System.out.println("Enter Mobile number : ");
        long number=sc.nextLong();
        
        System.out.println("enter digit :");
         System.out.println("Digit\tFrequency");
        for(i=0;i<11;i++)
        {
            count=0;
            temp=number;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }

}
