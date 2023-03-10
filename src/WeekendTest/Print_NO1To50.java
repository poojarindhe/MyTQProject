package WeekendTest;

public class Print_NO1To50 {

	public static void main(String[] args)
	{
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
			else if(i%2!=0)
			{
				System.out.println(i+ " is Negative no "+" "+i*i);
			}
		}
	}

}
