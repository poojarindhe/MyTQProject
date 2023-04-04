package com.array;

public class DiamondPattern {

	
			public static void main(String[] args) 
			{
				for(int i=0;i<5;i++)
				{
					for(int sp=4;sp>i;sp--)
					{
						System.out.print(" ");
					}
					for(int j=0;j<2*i-1;j++)
					{
						
							System.out.print("*");
						
					}
					System.out.println("");
				}
				for(int i=5-1;i>=1;i--)
				{
					for(int sp=5-1;sp>i;sp--)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=2*i-1;j++)
					{
						
							System.out.print("*");
						
					}
					System.out.println("");
				}


			

        


	}

}
