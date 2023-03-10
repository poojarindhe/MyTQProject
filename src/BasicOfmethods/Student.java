package BasicOfmethods;

public class Student {
	int id;
	String name;
	int m1,m2,m3;
	int per;
	
	public void accept()
	{
		id=11;
		name="pooja";
		m1=60;
		m2=50;
		m3=70;
		
	}
	public void calculate()
	{
	  per=(m1+m2+m3/300)*100;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(m1+""+m2+""+m3);
		System.out.println(per);
	}

	public static void main(String[] args)
	{
		Student s=new Student();
		s.accept();
		s.calculate();
		s.display();

	}

}
