package com.weekendTest3;
class CreditCard 
{
	public CreditCard() 
    {
      
      }
}
class DebitCard
{
	public DebitCard()
    {
    }
}


class ShopDemo 
{
	    public void doTransaction(CreditCard cd)
	    {
	        System.out.println("You got 15% discount on bill on credit card transaction.");
	       
	    }

	    public void doTransaction(DebitCard dc)
	    {
	        System.out.println("No discount on bill on debit card transaction.");
	    
	    }
	
	    public static void main(String[] args)
		{
		       ShopDemo shop = new ShopDemo();

		        CreditCard cc = new CreditCard();
		        DebitCard dc = new DebitCard();
		        
		        
	            shop.doTransaction(cc);
		        shop.doTransaction(dc);
		}
 }
	

