package com.StringDemo;

public class Test {

	public static void main(String[] args) 
	{
	  String str ="Hello";
	  String str2="Hello";
	  String str1=new String("Hello");
	  
	  System.out.println(str==str2);
	  System.out.println(str+" "+str1);
	  System.out.println(str==str1);
	  System.out.println(str.hashCode()+" "+str1.hashCode());
	 
	  if(str==str1)
	  {
		  System.out.println("equal");
	  }
	  else
	  {
		  System.out.println("not equal");
	  }
	  if(str.equals(str1))
	  {
		  System.out.println("contents of string is same");
	  }
	  else
	  {
		  System.out.println("not same");
	  }
	  

	}

}
