
import a.Person;
import a.b.ContactInfo;
import a.b.c.Employee;
class Office
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		System.out.print("First Employee is  ");
		e1.show();
		Employee e2=new Employee("Ramesh  ","sharma",248052,10000);
		System.out.print("Second Employee is  ");
		e2.show();
		Employee e3=new Employee(e2);
		System.out.print("Third Employee is  ");
		e3.show();
		Employee e4=new Employee("Mukesh "," sharma",248055,30000);
		System.out.print("Fourth Employee is  ");
		e4.show();
	}
}
		