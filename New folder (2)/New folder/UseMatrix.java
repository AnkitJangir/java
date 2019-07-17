class UseMatrix 
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		System.out.println("First matrix is");
		m1.show();
		Matrix m2=new Matrix(2,2);
		System.out.println("Second matrix is");
		m2.read();
		m2.show();
		Matrix m3=new Matrix(m2);
		m3.read();
		m3.show();
		/*m1.read(3,3);
		System.out.print("Now First array is");		
		m1.show();*/
	}
}
