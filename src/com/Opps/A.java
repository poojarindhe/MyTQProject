package com.Opps;

   public class A {
	 
		 public static void main(String args[])
		 {  
		   AccessModifire obj = new AccessModifire();
		   System.out.println(obj.b);
		   System.out.println(obj.c);
		 //  System.out.println(obj.a);a is private vari//compiler error;
		   obj.msg1();
		   obj.m2();
		   obj.msg();
		   obj.msg1();
		   
		 
		}  

}
