class Demo9
{
	public static void main(String args[])
	{
		String s="a bcd";
		System.out.println("length method of String :::"+ s.length());		//find the legth of String
		String s2=s.replace ('a','j');
		System.out.println("replacement method :::"+s2);		//Replace a character in a string 
		String s3="  ab  cd    ";
		System.out.println(s3.length());
		s3=s3.trim();
		System.out.println(s3); 			// Trim the spaces but not the interior
		String s4="Oracle";
		System.out.println(s4.startsWith("Ora"));	//to match the start character
		System.out.println(s4.endsWith("acle"));	//to match the end character
		s4=s4.toLowerCase();
		System.out.println(s4);
		s4=s4.toUpperCase();		//to change the string in lowet case
		System.out.println(s4);		//to change the string in upper case
		char ch;
		ch=s4.charAt(2);		//extract the character at a specify index position from a string 
		System.out.println(ch);
		String s5;
		s5=s4.substring (3);
		System.out.println(s5);
		s5=s4.substring(1,4);
		System.out.println(s5);
		String s6="xyabcdabpqab**ab##";
		int position ;
		position = s6.indexOf("xyz");
		System.out.println(position);
		position = s6.indexOf("ab");
		System.out.println(position);
		position = s6.indexOf("ab",4);		//to find the first occurence in string 
		System.out.println(position);
		position = s6.lastIndexOf("xyz");		//to find the last occurence in a String 
		System.out.println(position);
		position=s6.lastIndexOf("ab",13);
		System.out.println(position);
		
		
		//////////////////compareTo()//////////////////////
		
		
		s5="abcd";
		s6="abcd";
		int result;
		result=s5.compareTo(s6);
		System.out.println(result);
		s5="adbc";
		s6="abcd";
		result=s5.compareTo(s6);
		System.out.println(result);
		s5="abcd";
		s6="aebc";
		result=s5.compareTo(s6);
		System.out.println(result);
		
		////////////////comparing the string ///////////////////
		
		s5="java";
		s6="Java";
		if(s5==s6)										// equalry operator to compare the reference of string objects
		{
			System.out.println("s5 is equal to s6");
		}
		else
		{
			System.out.println("s5 is not equals to s6");
		}
		System.out.println(s5.equals(s6));			// equals() to  compare the two strings with in sensitive case
		System.out.println(s5.equalsIgnoreCase(s6));	// equalsIgnoreCase() to compare the Two string with case sensitive	
		
		/////////////to get the array of a string /////////////////////
		
		
		char a[];
		a=s6.toCharArray();
		System.out.println(a);
		
		///////////////to get the array of characters by extracting the spcific portion of a string object ///////////////
		
		s6="Oracle";
	 	a=new char[10];
		s6.getChars(1,4,a,0);
		System.out.println(a);
		
		/////////////to crate a string object from a array/////////////// Static method of string ///////////
		
		char aa[]={'O','r','a','c','l','e'};
		String s7=String.copyValueOf(aa);	///first version of copyvalueOf()
		System.out.println(s7);
		s7=String.copyValueOf(aa,2,3);	//second version of copyValueOf()
		System.out.println(s7);
		 
	}
}