package WeekendTest;

import java.util.Scanner;

//trimorphic_no=4=(4*4*4)cube=64...last digit is same;
public class Trimorphic_no {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the num :");
		int n=s.nextInt();
        int cube = n*n*n;

        while(n!=0)
        {
            if(n%10!=cube%10)
            {
                System.out.print("Not a Trimorphic number");
                break;
            }

            n = n/10;

            cube = cube/10;
        }

        if(n==0)
        {
            System.out.print("Trimorphic number");
        }
 
	}

}
 