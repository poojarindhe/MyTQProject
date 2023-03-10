package BasicOfmethods;

public class Product {
	
	String p_name;
	int  p_contity;
	int p_price;
	
	public void acceptDetails(String name,int contity,int price)
	{
		p_name=name;
		p_contity=contity;
		p_price=price;
		
	}
	public void display()
	{
		System.out.println(p_name+" "+p_contity+" "+p_price);
	}

	public static void main(String[] args)
	{
		Product p=new Product();
		p.acceptDetails("PC", 12, 40000);
		p.display();
		


	}

}
