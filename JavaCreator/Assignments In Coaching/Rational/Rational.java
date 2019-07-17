import java.io.*;
class Rational
{
	private int n,d;
  	public Rational()
  	{
	}
  	public Rational(int x, int y)
  	{
	 	n=x;
		d=y;
	}
  	public Rational( Rational R)
  	{
		n=R.n;
		d=R.d;
	}
  	public Rational add(Rational R)
  	{
		Rational temp= new Rational();
    	if((n==0)||(R.n==0))
    	{
			if((n==0)&&(R.n==0))
      		{
				temp.set(0,0);
			}
      		if(n!=0)
      		{
				temp.n=n;
				temp.d=d;
			}
      		if(R.n!=0)
      		{
				temp.n=R.n;
				temp.d=R.d;
			}
    	}
    	else
    	{
			temp.n=(R.d*n)+(d*R.n);
     		temp.d=d*R.d;
    	}
    	return temp;
  	}
  	public Rational less(Rational R)
  	{
		Rational temp= new Rational();
    	if((n==0)||(R.n==0))
    	{ 
			if((n==0)&&(R.n==0))
      		{
				temp.set(0,0);
			}
      		if(n!=0)
      		{
				temp.n=n;
				temp.d=d;
			}
      		if(R.n!=0)
      		{
				temp.n=R.n;
				temp.d=R.d;
			}
    	}
    	else
    	{
			temp.n=(R.d*n)-(d*R.n);
     		temp.d=d*R.d;
    	}
    	return temp;
  	}
  	public Rational multiply(Rational R)
  	{
		Rational temp= new Rational();
    	if((n==0)||(R.n==0))
    	{
			if((n==0)&&(R.n==0))
      		{
				temp.set(0,0);
			}
      		if(n!=0)
      		{
				temp.n=n;
				temp.d=d;
			}
      		if(R.n!=0)
      		{
				temp.n=R.n;
				temp.d=R.d;
			}
    	}
    	else
    	{
			temp.n=n*R.n;
     		temp.d=d*R.d;
    	}
    	return temp;
  	}
  	public Rational devide(Rational R)
  	{
  		Rational temp= new Rational();
  		if((n==0)||(R.n==0))
   		{
			if((n==0)&&(R.n==0))
   			{
				temp.set(0,0);
			}
      		if(n!=0)
      		{
				temp.n=n;
				temp.d=d;
			}
      		if(R.n!=0)
      		{
				temp.n=R.n;
				temp.d=R.d;
			}
    	 }
    	 else
    	 {
		 	temp.n=R.d*n;
     		temp.d=d*R.n;
    	 }
    	 return temp;
  	}
  	public void set(int x, int y)
  	{
		 n=x;
		 d=y;
	}
  	public void show()
  	{
		System.out.println(n+":"+d);
	}
}
class UseRational
{ 
	public static void main(String args[])
	{
    	Rational m1,m2,m3;
    	int i,j;
    	m1=new Rational();
    	m1.show();
    	m2=new Rational(10,5);
    	m2.show();
    	m3=new Rational(m2);
    	m3.show();
    	Console con = System.console();
    	System.out.println("Enter values for first rational no.");
    	System.out.print("Enter numerator= ");
    	i=Integer.parseInt(con.readLine());
    	if(i!=0)
    	{
			do
      		{
				label:System.out.print("Enter denominator= ");
       			j=Integer.parseInt(con.readLine());
       			if(j==0)
       			{
       				System.out.println("*Infinite Cases Are Not Allowed*");
     			}
      		}
     		while(j==0);
     		m1.set(i,j);
     		System.out.print("First rational no. is ");
			m1.show();
    	}
    	else
     	m1.set(0,0);
    	System.out.println("Enter values for second rational no.");
    	System.out.print("Enter numerator= ");
    	i=Integer.parseInt(con.readLine());
    	if(i!=0)
    	{
			do
      		{
				label:System.out.print("Enter denominator= ");
       			j=Integer.parseInt(con.readLine());
       			if(j==0)
       			{
       				System.out.println("*Infinite Cases Not Allowed*");
      			}
      		}
     		while(j==0);
     		m2.set(i,j);
     		System.out.print("Second rational no. is ");
			m2.show();
    	}
    	else
     	{
			m2.set(0,0);
    		m3= m1.add(m2);
    		System.out.print("Sum is : ");
			m3.show();
    		m3= m1.less(m2);
    		System.out.print("Difference is : ");
			m3.show();
    		m3= m1.multiply(m2);
    		System.out.print("Multiplication is : ");
			m3.show();
    		m3= m1.devide(m2);
    		System.out.print("Dividation is : ");
			m3.show();
  		}
	}
}