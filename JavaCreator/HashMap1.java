import java.util.*;
class Student
{
	private String name,phone;
	public Student(String nm,String ph)
	{
		name=nm;
		phone=ph;
	}
	public void show()
	{
		System.out.println("Name is : "+name+"Phone is : "+phone);
	}
}
class School
{
	public static void main(String args[])
	{
		HashMap map=new HashMap();
		Student s1=new Student("John","8290389911");
		map.put("102",s1);
		Student s2=new Student("Ankit jangir","8290389921");
		map.put("112",s2);
		Student s3=new Student("Rani","8290385611");
		map.put("202",s3);
		Student x;
		x=(Student)map.get("102");
		x.show();
		x=(Student)map.get("112");
		x.show();
		x=(Student)map.get("202");
		x.show();
	}
}