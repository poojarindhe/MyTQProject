package com.Opps;

public class CarInfo {

	public static void main(String[] args)
	{
      Car c=new Car();
      c.setId(11);
      c.setName("swift");
      c.setPrice(300000);
      
      System.out.println(c.getId()+" "+c.getName()+" "+c.getPrice());
	}

}
