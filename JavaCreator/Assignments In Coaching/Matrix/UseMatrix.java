class UseMatrixInConstructor 
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		try
		{
			m1.set(4,4);
		}
		catch(InvalidSizeException e1)
		{
			System.out.println(e1.getMessage());
		}
		System.out.println("First matrix is");
		m1.show();
		Matrix m2=new Matrix(2,2);
		System.out.println("Second matrix is");
		m2.read();
		m2.show();
	}
}
