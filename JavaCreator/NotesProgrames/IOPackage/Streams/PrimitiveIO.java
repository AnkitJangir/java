import java.io.*;
class PrimitiveIO
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("data.bin");	
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(22545);
		dos.writeDouble(2045.23325);
		dos.writeBoolean(true);
		dos.writeChar('A');
		dos.close();
		FileInputStream fis=new FileInputStream("data.bin");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		dis.close();
	}
}