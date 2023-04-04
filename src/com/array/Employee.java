package com.array;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(int i,String n,float s)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) 
	{
       Employee e[]= new Employee[3];
       e[0]=new Employee(11,"Pooja",30000f);
       e[1]=new Employee(12,"Nikita",20000f);
       e[2]=new Employee(13,"Monika",40000f);
      // System.out.println(e[2].id+" "+e[2].name+" "+e[2].salary);
       
       
       
       for(Employee emp : e)
       {
    	   if(emp.salary>20000)
    	   {
    	   System.out.println(emp);
            }
	    }
	}
}
