class Demo6
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5};
		outer:
			for(int i=0;i<arr.length;i++)
			{
				inner:
					for(int j=0;j<arr.length;j++)
					{
						if(i==j)
						{
							continue outer;
						}	
					System.out.println("i:"+i+" "+"j:"+j);
						
					}
			}
	}
}