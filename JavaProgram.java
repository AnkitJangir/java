class A
{
	public static void main(String args[])
	{
		int i,a,temp=0,count=1,max=1;
		for(i=0;i<10;i++)
		{
			a=(int)(Math.random()*100);
			System.out.print("  "+a);
			if(i==0)
			{
				temp=a;
				continue;
			}
			else
			{
				if(temp<a)
				{
					count++;
					temp=a;
						  	
				}
				else
				{
					max=count;
					temp=a;
					count=1;
				}
				
			}
			
		}
		System.out.println(" "+max);
	}
}