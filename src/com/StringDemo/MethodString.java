package com.StringDemo;

import java.util.Arrays;

public class MethodString 
 {
	public static void main(String[] args)
	{
	     String s1="Hello";
	     String s2="Hello";
	     String s3= new String("Hello");
	     
	     String str=" Pooja ";
	     
	     String first="JAVA";
	     String second="Programming";
	     
	     System.out.println(s1==s2);
	     System.out.println(s1==s3);
	     String x=s1+s3;
	     System.out.println(x);
	     String z=s1.concat(x);
	     System.out.println(z);
	     System.out.println(x.length());
	     
	     
	     String joinedString = first.concat(second);//concat method
	     System.out.println("Joined String: " + joinedString);
	     
	     boolean result=first.equals(second);//compare string
	     System.out.println(result);

	     System.out.println(str);
	     System.out.println(str.trim());//trim method used to remove white space before and after the string
	
	      System.out.println(first.toLowerCase());//java
	      System.out.println(second.toUpperCase());//PROGRAMMING
	      
	      System.out.println(second.startsWith("Pr"));//true...check first char in string    
	      System.out.println(second.endsWith("m"));//true....check last char in string 
	     
	      System.out.println(str.charAt(3));//charAt() method returns a character at specified index.
	
	      String s=new String("java");    
	      String ss=s.intern();    
	      System.out.println(ss);//java....this method return string 
	      
	      String replaceString=s.replace('j', 'k');
	      System.out.println(replaceString);//return string
	
	      int a=10;    
	      String b=String.valueOf(a);    
	      System.out.println(b+10);   //return the string representation of int argument 
	
	      
	     String n="java is programming language";
	     String []n1=n.split(" ");
	     System.out.println(Arrays.toString(n1));
	     
	     System.out.println(n.contains("va"));//return type boolean
	     
	     System.out.println(n.toCharArray());
	     
	     char []ch=str.toCharArray();//return type char array
	     System.out.println(ch);
	     for(int i=0;i<ch.length;i++)
	     {
	    	 System.out.println(ch[i]);
	     }
	     
	     System.out.println(n.indexOf('v'));//int return type
	     
	     
	     System.out.println(second.substring(2, 8));//return type string
	      
	}

} 
