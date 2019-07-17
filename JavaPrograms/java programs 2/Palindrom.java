class Palindrom
{
	public static void main(String[] args) 
	{
		int temp=0,reverse=0;
		int n;
		n=(int)(Math.random()*100);
		for (int i = 0; i <n ; i++)
		{
                	int check = n;
                	while (check > 0) 
			{
                		temp = check % 10;
                		check = check / 10;
                		reverse = reverse * 10 + temp;
            		}
	        	if (n == reverse)
			{
                		System.out.println(n + " is a palindrome");
            		}
            		else
			{
                		System.out.println(n + " is NOT a palindrome");
            		}
		}
	}
}
