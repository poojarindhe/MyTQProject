package Practice_java;

import java.util.Scanner;

public class Cal_AreaUsingSwitch
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the operation:");
		System.out.println("1 Circle /t 2 Triangle /t 3 Rectangle /t 4 Square ");
		int num=sc.nextInt();
		
		
		switch(num)
		{
		case 1:System.out.println("Enter radius of circle :");
		double radius=sc.nextDouble();
		double areaCircle=(22*radius*radius/7);
		System.out.println("Area of circle :"+areaCircle);
		break;
		
		case 2:System.out.println("Enter the base and hight of triangle :");
		double base=sc.nextDouble();
		double hight=sc.nextDouble();
		double areaTriangle=(base*hight)/2;
		System.out.println("Area of triangle is :"+areaTriangle);
		break;
		
		case 3:System.out.println("Enter the length and breadth of rectangle :");
		int lenght=sc.nextInt();
		int breadth=sc.nextInt();
		int areaRectangle=lenght*breadth;
		System.out.println("Area of Rectangle is :"+areaRectangle);
		break;
		
		case 4:System.out.println("Enter the side of square ");
		int side=sc.nextInt();
		int square=side*side;
		System.out.println("Square is :"+square);
		break;
		}
		
	}

}
