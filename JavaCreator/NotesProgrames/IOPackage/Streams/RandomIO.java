import java.io.*;
class RandomIO
{
	public static void main(String args[])
	{
		try
		{
			RandomAccessFile ref=new RandomAccessFile("random.dat","rw");
			ref.writeChar('B');
			ref.writeInt(56466);
			ref.writeDouble(56466.2545);
			ref.seek(0);
			System.out.println(ref.readChar());
			System.out.println(ref.readInt());
			System.out.println(ref.readDouble());
			ref.seek(2);
			System.out.println(ref.readInt());
			ref.seek(ref.length());
			ref.writeBoolean(true);
			ref.seek(14);
			System.out.println(ref.readBoolean());
			ref.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}