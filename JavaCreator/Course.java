import java.util.*;
public enum Course
{
	JAVA("Bijendra Bhati",8000);
	ANDROID("Praveen Saxena",5000);
	iOS("Ankit jangir",4000);
	private final String faculty;
	private final int fee;
	Course (String name,int amount )
	{
		faculty = name;
		fee = amount ;
		
	}
	public String getFacultyMemberName()
	{
		return faculty;
	}
	public int getCourseFee()
	{
		return fee;
	}
}
class Admission
{
	public static void main(String args[])
	{
		System.out.println("All Courses:\n\n");
		for(Course cs : Course.value())
			System.out.println(cs+"\t"+cs.getFacultyMemberName()+"\t"+s.getCourseFee());
		System.out.println("\n\n Range of enum Constnts \n\n");
		for(Course cs : EnumSet.range(Course.ANDROID,Course.JAVA))
			System.out.println(cs+"\t"+csgetFacultyMemeberName()+"\t"+s.getCourseFee());
	}
}