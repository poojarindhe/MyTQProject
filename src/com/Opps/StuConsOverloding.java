package com.Opps;

public class StuConsOverloding 
{
	
	 int id;  
	    String name;  
	    int age;  
	    StuConsOverloding ()
	    {
	    	System.out.println("default constructor");
	    }
	    //creating two arg constructor  
	    StuConsOverloding (int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    StuConsOverloding (int i,String n,int a)
	    {  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+age);
	    }  
	   
	    public static void main(String args[])
	    {  
	    StuConsOverloding  s1 = new StuConsOverloding (111,"Karan");  
	    StuConsOverloding  s2 = new StuConsOverloding (222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
}


