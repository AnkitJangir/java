class abc
{
	public static void main (String[] args) 
	{
		String str;
		int no=25;
		//str=no;		/// copmile time error becoz numeric data type cant't convert to string refernce variable		
		str=no+"";
		System.out.println(str);
		str=no+" 23";
		System.out.println(str);
	}
}