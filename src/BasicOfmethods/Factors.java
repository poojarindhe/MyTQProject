package BasicOfmethods;

public class Factors 
{
	
	
	
	public void fact(int n)
	{
		 for (int i = 1; i <= n; ++i)
		    {

		      // if number is divided by i
		      // i is the factor
		      if (n % i == 0)
		      {
		        System.out.print(i + " ");
		      }
		    }

	}


   // System.out.print("Factors of " + number + " are: ");

	public static void main(String[] args)
	{
		Factors f =new Factors();
		f.fact(10);
		

	}

}
