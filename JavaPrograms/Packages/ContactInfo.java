package a.b;
//import a.Person;
public class ContactInfo extends a.Person
{
	public int phone;
	public ContactInfo()
	{
		phone=0;	
	}
	public ContactInfo(String nm,String surnm,int m)
	{
		super(nm,surnm);
		phone=m;
	}
	public ContactInfo(ContactInfo c)
	{
		super(c);
		phone=c.phone;
	}
}
