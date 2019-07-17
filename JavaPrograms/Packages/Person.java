package a;
public class Person
{
	public String name,surname;
	public Person()
	{
		name="Unknown";
		surname="unknown";
	}
	public Person(String nm,String surnm)
	{
		name=nm;
		surname=surnm;
	}
	public Person(Person na)
	{
		name=na.name;
		surname=na.surname;
	}
}