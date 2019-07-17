import java.io.*;
class StreamTokenizer1
{
	public static void main(String args[])throws IOException
	{
		StreamTokenizer st=new StreamTokenizer(new FileInputStream("MyStack.java"));
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			String s;
			switch(st.ttype)
			{
				case StreamTokenizer.TT_EOL:
				s="EOL";
				break;
				case StreamTokenizer.TT_NUMBER:
				s=st.nval+"";
				break;
			//	case StreamTokenizer.TT_WORD:
			//	s=st.nval;
				//break;
				default:
					s=""+((char)st.ttype);
			}
			System.out.println(s);
		}
	}
}