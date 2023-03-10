package com.containment;

class Menu
{
	int mid;
	String mitem;
	
	Menu(int mid,String mitem)
	{
		this.mid=mid;
		this.mitem=mitem;
	}
	public String toString()
	{
		return mid+" "+mitem;
	}
  // void disMenu()
	//{
	//System.out.println(mid+" "+mitem);
	//}
	
}

public class Order {
	int id;
	int contity;
	Menu menu;
	
	Order(int id,int contity,Menu menu)
	{
		this.id=id;
		this.contity=contity;
		this.menu=menu;
	}
	
	public String toString()
	{
		return id+" "+contity+" "+menu;
	}
	/*
	 * void disOrder() { System.out.println(id+" "+contity); //menu.disMenu(); }
	 */

	public static void main(String[] args)
	{
		Menu m = new Menu(11,"Rice");
		Order o=new Order(11,25,m);
		
		//Order o=new Order(11,25,new Menu(1,"soup"));
		System.out.println(o);
		//o.disOrder();

	}

}
