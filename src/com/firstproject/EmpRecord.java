package com.firstproject;

import java.util.Scanner;

class Employee 
{
	
		int  eid;
		String e_name;
		String e_dept;
		int e_salary;
		Employee emp[];
		int count=0;
		
		
		  Employee() {
		  
		  }
		  void createEmp()
		  {
			  emp=new Employee[4];
		  }
		 
		
		 Employee(int eid,String name,String dept,int salary)
		{
			this.eid=eid;
			this.e_name=name;
			this.e_dept=dept;
			this.e_salary=salary;
	
		}
		void insertEmp(int eid,String name,String dept,int salary)
		{
			emp[count]=new Employee(eid,name,dept,salary);
			count++;
		}
		void showAllEmp()
		{
			for(Employee e : emp)
			{
				if(e!=null) {
				System.out.println(e);
			                }   
	         }
		}
		void showEmpbyId()
		{
			for(Employee e : emp)
			{
				System.out.println(e);
			}
			
		}
		void updateRecord(int eid,String name,String dept,int salary)
		{
			for(Employee e : emp)
			{
				if(e!=null)
				{
					if(emp.equals(e.eid))
					{
		               e.e_name="Swati";
				       e.e_dept="Mechanical";
				       e.e_salary=40000;
				       System.out.println(e);
					}
				}
			}
			
		}
		public Employee readEmployee(int eid)
		{
			for(int i=0;i<count;i++)
			{
				if(emp[i].eid==eid)
				{
					return emp[i];
				}
			}
			return null;
		}
	public Employee deleteRecord(int id_no)
		{
			for(int i=0;i<emp.length;i++)
			{
				if(emp.equals(emp[i].eid))
				{
				if(emp[i].eid==id_no)
				{
					emp[i].e_name=null;
					emp[i].e_dept=null;
					emp[i].e_salary=0;
					System.out.println(emp[i].e_name+" "+emp[i].e_dept+" "+emp[i].e_salary);
				}
				
			}
			
			}
			return null;
			
		}
		public String toString()
		{
			return eid+" "+e_name+" "+e_dept+" "+e_salary;
		}
		
}	
public class EmpRecord {

	public static void main(String[] args) 
	{
		/*
		  System.out.println("List of Employee"); for(int i=0;i<emp.count;i++) {
		  System.out.println("ID :"+emp.e_id);
		  System.out.println("Employee Name :"+emp.e_name);
		  System.out.println("Department :"+emp.e_dept);
		  System.out.println("Salary :"+emp.e_salary);
		 * 
		 * 
		 * }
		 * 
		 */
	char ch;	
	do
	{
		Scanner sc=new Scanner(System.in);
		
		Employee emp = new Employee();
		emp.createEmp();
		System.out.println("List of Employee");
		emp.insertEmp(101,"Pooja","IT",50000);
		emp.insertEmp(102,"Monika","computer",60000);
		emp.insertEmp(103,"Preeti","Electronics",40000);
		
		
		
		System.out.println("1-Update\n2-Delete\n3-Show Employee");
		System.out.println("....................");
		System.out.println("Enter your choice :");
		int n=sc.nextInt();
		switch(n)
		{
		case 1 : System.out.println("update Employee :");
		System.out.println("Enter id :");
		int u_id=sc.nextInt();
		//emp.updateRecord(103," Manisha","IT",80000);
		emp.readEmployee(u_id);
		System.out.println(emp.eid+" "+emp.e_name+" "+emp.e_dept+" "+emp.e_salary);
		break;
		
		case 2 : System.out.println("Delete Employee :");
		//emp.deleteRecord();
		System.out.println("Enter id :");
		int id_no=sc.nextInt();
		if(id_no==101||id_no==102||id_no==103)
		{
		Employee r1=emp.deleteRecord(id_no);
		System.out.println(r1.eid+" "+r1.e_name+" "+r1.e_dept+" "+r1.e_salary);
		
		break;
		}
		case 3 : System.out.println("Show all Employee Record :");
		emp.showAllEmp();
		break;
		
		case 4 : System.out.println("Read Employee");
		//emp.readEmployee(101);
		Employee r2=emp.readEmployee(101);
		System.out.println(r2.eid+" "+r2.e_name+" "+r2.e_dept);
		break;
		
		default : System.out.println(" Invalid choise");
		}
		
		System.out.println(" Do you want Continue.....");
	     ch =sc.next().charAt(0);
		
		}while(ch=='y'||ch=='Y');
	
	
	}
		

	}



