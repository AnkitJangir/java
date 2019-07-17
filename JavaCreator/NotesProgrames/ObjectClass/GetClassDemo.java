class getclassDemo
{
	public static void main(String args[])
	{
		Object o;
		o=new String("java");
		o=new String("an");
		o=new String ("AN");
		Class c=o.getClass();
		System.out.println(c.getName());
	}
}