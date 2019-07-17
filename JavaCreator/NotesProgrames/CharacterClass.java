class Demo
{
	public static void main(String args[])
	{
		char ch = ' ';
		System.out.println((Character.isWhitespace(ch)));			// to check character has the space or not
		ch='7';
		System.out.println(Character.isDigit(ch));   		//to check charater has the digit or not
		ch='a';
		System.out.println(Character.isAlphabetic(ch));		//to check charater is alphabetic or not
		ch='A';
		System.out.println(Character.isLowerCase(ch));		// to check character is lower case or not
		System.out.println(Character.isUpperCase(ch));		//to check character is upper case or not
		ch=Character.toLowerCase(ch);		// to convert the  character in lower case
		System.out.println(ch);
		ch=Character.toUpperCase(ch);		// to convert the  character in  upper case 
		System.out.println(ch);
		
	}
}