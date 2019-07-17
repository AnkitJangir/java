class Roll
{
	public int rollno;
	public Roll()
	{
		rollno=0;
	}
	public Roll(int rn)
	{
		rollno=rn;
	}
	public Roll(Roll rl)
	{
		rollno=rl.rollno;
	}
}
class Result extends Roll
{
	public int marks;
	public Result()
	{
		marks=0;
	}
	public Result(int rn,int mks)
	{
		super(rn);
		marks=mks;
	}
	public Result(Result rs)
	{
		super(rs);
		marks=rs.marks;
	}
}
class Student extends Result
{
	String name;
	public Student()
	{
		name="unknown";
	}
	public Student(int rn,String nm,int mks)
	{
		super(rn,mks);
		name=nm;
	}
	public Student (Student s)
	{
		super(s);
		name=s.name;
	}
	public void show()
	{
		System.out.println("Roll no.:"+rollno+"Student name:"+name+"Student marks:"+marks);
	}
}	
public class School
{
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println("First Student is : ");
		s1.show();
		Student s2=new Student(1,"Ankit Jangir",60000);	
		System.out.print("Second Student is : ");
		s2.show();
		Student s3=new Student(s2);
		s3.show();
	}
}
