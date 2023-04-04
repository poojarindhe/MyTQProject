package com.array;


class Department
{
	int did;
	String dname;
	public void setDid(int did)
	{
		this.did=did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
}
public class Employeec {
	int id;
	String name;
	int salary;
	Department dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setDept(Department dept)
	{
		this.dept=dept;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public Department getDept()
	{
		return dept;
	}
	

	public static void main(String[] args) 
	{
       Employeec e1= new Employeec();
       e1.setId(11);
       e1.setName("Santosh");
       e1.setSalary(150000);
       e1.setDept(new Department());
       e1.getDept().setDid(22);
       e1.getDept().setDname("Pooja");
       System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getDept().getDid()+" "+e1.getDept().getDname());
        
     }

}

