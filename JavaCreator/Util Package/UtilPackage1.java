import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Bodacious
{
	public static void main(String args[])
	{
		String line="We learn java at Bodacious";
		String pattern="(.*)(java)(.*)";
		Pattern r=Pattern.compile(pattern);
		Matcher m=r.matcher(line);
		if(m.find())
		{
			System.out.println("Found value:"+m.group(0));
			System.out.println("Found value:"+m.group(1));
			System.out.println("Found value:"+m.group(2));
			System.out.println("Found value:"+m.group(3));
		}
		else
			System.out.println("No Match");
	}
}