public class PalindromThroughArray
{
 	public static void main(String[] args) 
	{
        	int numbers[] = new int[]{ 25,2, 54, 99, 12,33, 66, 98,76 };
	        for (int i = 0; i < numbers.length; i++)
		{
                	int numberToCheck = numbers[i];
                	int numberInReverse = 0;
               	 	int temp = 0;
                	while (numberToCheck > 0) 
			{
                		temp = numberToCheck % 10;
                		numberToCheck = numberToCheck / 10;
                		numberInReverse = numberInReverse * 10 + temp;
            		}
	        	if (numbers[i] == numberInReverse) 
			{
              			System.out.println(numbers[i] + " is a palindrome");
            		}
            		else 
			{
                		System.out.println(numbers[i] + " is NOT a palindrome");
            		}     
        	}
    	}
}