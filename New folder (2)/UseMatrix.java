class UseMatrix 
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		System.out.println("First matrix is");
		m1.show();
		Matrix m2=new Matrix(5,4);
		System.out.println("Second matrix is");
		m2.show();
		Matrix m3=new Matrix(m2);
		m3.show();
		/*m1.read(3,3);
		System.out.print("Now Firat array is");		
		m1.show();*/
	}
}
