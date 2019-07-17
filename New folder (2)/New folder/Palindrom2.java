public class Palindrom2
{
 	public static void main(String[] args) 
	{
        	int numbers[] = new int[]{ 252, 54, 99, 1233, 66, 9876 };
	        for (int i = 0; i < numbers.length; i++) {
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
