import java.util.*;
class Person
{
	private String name,surname;
	public Person(String nm,String surnm)
	{
		name=nm;
		surname=surnm;
	}
	public int hashCode()
	{
		String str=name+surname;
		return str.hashCode();
	}
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		Person p=(Person)o;
		if(name.equals(p.name)&&surname.equals(p.surname))
			return true;
		else
			return false;
	}
}

class UsePerson
{
	public static void main(String args[])
	{
		HashMap map=new HashMap();
		Person p1=new Person("Raj","Sharma");
		map.put(p1,"333333");
		Person p2=new Person("Ankit ","Jangir");
		map.put(p2,"777777");
		System.out.println(map.size());
	}
}