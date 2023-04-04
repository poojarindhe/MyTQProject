package com.inheritance;
class Wild
{
	public void animal()
	{
		System.out.println(" Lion is wild animal");
	}
	
	public void animal(String str)
	{
		System.out.println(str+ " is wild animal ");
		
	}
	
	public void animal(String str1,String str2)
	{
		System.out.println(str1+"& "+str2+" "+"is my fav animal");
	}
}
class Pet extends Wild
{
	public void animal()
	{
		System.out.println("Cat is pet animal");
	}

public void animal(String str1,String str2)
{
	System.out.println(str1+"and"+str2+" is pet animal");
	
}
}
public class ComboOverlodOverride {

	public static void main(String[] args) 
	{
		Wild obj=new Wild();
		obj.animal("peacock", "deer");
		obj.animal("monkey");
		
		Wild w=new Pet(); 
		w.animal();
		w.animal("Tiger");
		w.animal("cat", "dog");

	}

}
 