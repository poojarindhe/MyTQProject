package weekendtest2;

public class PatternQ4 {

	public static void main(String[] args)
	{
		int i, j, num;         
		for (i=1; i<=5;i++)   
		{  
		for (j =5; j>=i; j--)  
		{  
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
		if(k%2 != 0)  
		{  
		System.out.print(1);  
		}  
		else  
		{  
		System.out.print(0);  
		}  
		}  
		System.out.println();  
		}  
	}

}
