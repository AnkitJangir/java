package a.b.c;
//import a.b.ContactInfo;
import a.Person;
public class Employee extends a.b.ContactInfo
{
	public int salary;
	public Employee()
	{
		salary=0;
	}
	public Employee(String nm,String surnm,int phone,int s)
	{
		super(nm,surnm,phone);
		salary=s;
	}
	public Employee(Employee e)
	{
		super(e);
		salary=e.salary;
	}
	public void show()
	{
		System.out.println("Name : "+name+"  "+surname+"  phone no. : "+phone+" salary : "+salary);
	}
}