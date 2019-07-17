import java.util.*;
class EnumCourse
{
	JAVA("Bijendra Bhati",8000);
	Android("Praveen Saxena",6000);
	ios("Ali M Irshad",9000);
	SALESFORCE("Shrey Sahrma",8000);
	LINUX("Vishawajeet Srivastava",6000);
	PHP("Praveen Sharma",6000);
	private final String faculty;
	private final int fee;
	EnumCourse(String name,int amount)
	{
		faculty=name;
		fee=amount;
	}
	public String getFacultyMemberNmae()
	{
		return faculty;
	}
	public int getCourseFee()
	{
		return fee;
	}
	public static void main(String args[])
	{
		System.out.println("All Course:\n\n");
		for(Course cs:Course.value())
			System.out.println(cs+"\t"+cs.getFacultyMemberName()+"\t"+s.getCourseFee());
		System.out.println("\n\n Range of enum constants\n\n");
		for(Course cs:EnumSet.range(Course.ANDROID,Course.LINUX))
			System.out.println(cs+"\t"+cs.getFacultyMemberName()+"\t"+s.getCourseFee());
		
	}
}
