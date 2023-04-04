package com.weekendTest3;
class Department
{
	private String dname;
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDname()
	{
		return dname;
	}
}

public class Employee 
{
	private int id;
	private String name="Hi";
	private boolean ismanager;
	private float salary;
	Department dept;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamed() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsmanager() {
		return ismanager;
	}

	public void setIsmanager(boolean ismanager) {
		this.ismanager = ismanager;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public static void main(String[] args) 
	{
		Employee e= new Employee();
		e.setId(11);
		e.setName("kajal");
		e.setIsmanager(true);
		e.setSalary(50000.00f);
		e.setDept(new Department());
		e.getDept().setDname("computer");
		System.out.println(e.getId()+" "+e.getNamed()+" "+e.getSalary()+" "+e.getDept().getDname());
		
       
	}

}
