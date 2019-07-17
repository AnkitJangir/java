import java.io.*;
class InvalidAmountException extends Exception
{
    public InvalidAmountException(String str)
    {
            super(str);
    }
}
class Ration
{
	Console con = System.console();
	private int numerator,denominator;
	 
        

          public Ration add(Ration o)throws InvalidAmountException
         {
       	Ration temp = new Ration();
     	if(denominator==o.denominator)
     	{
     		temp.numerator = numerator+o.numerator;
     //       if(denominator>=0)
       //     {
     		temp.denominator = denominator;
         //   }
           // else
            //{
        //InvalidAmountException e= new InvalidAmountException("Amount cnt be -ve ");
        //throw e; 
       // }
     	}
     	else
     	  {	
     	     temp.numerator= numerator*o.denominator+denominator*o.numerator;
     	     temp.denominator= denominator*o.denominator;
     	 }
     	 return temp;
      }
     

     
     public Ration sub(Ration o)
     {
     	Ration temp = new Ration();
     	if(denominator==o.denominator)
     	{
     		temp.numerator = numerator-o.numerator;
     		temp.denominator = denominator;
     	}
     	else
     	  {	
     	     temp.numerator= numerator*o.denominator-denominator*o.numerator;
     	     temp.denominator= denominator*o.denominator;
     	 }
     	 return temp;
      }


     public Ration mul(Ration o)
     {
     	Ration temp = new Ration();
     	if(denominator==o.denominator)
     	{
     		temp.numerator = numerator*o.numerator;
     		temp.denominator = denominator;
     	}
     	else
     	  {	
     	     temp.numerator= numerator*o.denominator*denominator*o.numerator;
     	     temp.denominator= denominator*o.denominator;
     	 }
     	 return temp;
      }

       public Ration div(Ration o)
      {
     	Ration temp = new Ration();
     	temp.numerator = numerator*o.denominator;
     	temp.denominator = o.numerator*denominator;
     	return temp;
      }

	
	void read()throws InvalidAmountException 
    {
		System.out.print("\nEnter Two Number");
		numerator =Integer.parseInt(con.readLine());
        denominator=Integer.parseInt(con.readLine());
        if(denominator<1 && numerator<1)
        {
            InvalidAmountException e= new InvalidAmountException("Amount cnt be -ve ");
            throw e;
        }
        
	}
	void show() 
	{
		System.out.print(numerator+"/"+denominator);
		
    }

}