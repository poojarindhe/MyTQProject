 package com.Weenked5;

public class Q2 {

	public static void main(String[] args)
	{

		int a[] = {12,22,32,42,52,62};

		int b[] = {52,22,62,12,42,32};


		boolean result = true;


		if (a.length != b.length) 
		{
			result=false;

		}
		else
		{
			for (int i = 0; i < a.length; i++)
			{
                boolean found=false;
                for(int j=0;j<b.length;j++)
                {

				if (a[i] == b[j]) 
				{
                    found=true;
                    break;
				}
		     	}
                if(!found)
                {
                	result=false;
                	break;
                }
			}
		}
		if(result)
		{
			System.out.println("Arrays are equals");
		}
		
		else {


			System.out.println("Arrays not equals");
		}


		
	}
}

