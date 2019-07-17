import java.util.regex.*;
class Demo
{
	public static void main(String args[])
	{
		String line="javaXY  java pq";
		Pattern p=Pattern.compile("java");
		Matcher m=p.matcher(line);
		while(m.find())
			System.out.println(m.start()+"\t"+m.end()+"\t"+m.group());
		String str="89 ab 241 XY";
		System.out.println("\\d");
		System.out.println(line);
		
	}
}