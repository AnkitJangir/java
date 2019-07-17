import java.io.*;
class AccountHolder implements Serializable
{
	private String name;
	private double balance;
	transient  private String password;		///transient variable is not serialized or we can't write or read its value from a object
	public AccountHolder(String nm,double bal,String pwd)
	{
		name=nm;
		balance=bal;
		password=pwd;
	}
	public void show()
	{
		System.out.println("Name :: "+name+" Balance ::"+balance+" ATM password :: "+password);
	}
}
class Bank
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Object.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		AccountHolder a=new AccountHolder("John",20000,"ABC");
		oos.writeObject(a);
		AccountHolder b=new AccountHolder("joe",40000,"ABCD");
		oos.writeObject(b);
		oos.close();
		FileInputStream fis=new FileInputStream("object.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		AccountHolder x;
		x=(AccountHolder)ois.readObject();
		x.show();
		x=(AccountHolder)ois.readObject();
		x.show();
		ois.close();
	}
}