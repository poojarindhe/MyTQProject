package WeekendTest;

public class Pattern {

	public static void main(String[] args) 
	{
		int rows=6;      
		//inner loop  
		for (int i= rows-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=1; j<=i; j++)  
		{  
		
		System.out.print(j + " ");  
		}  

		System.out.println();  
		}  
	}
}
