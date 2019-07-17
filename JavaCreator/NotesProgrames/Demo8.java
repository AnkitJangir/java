class Demo8
{
	public static void main(String args[])
	{
		String a[]=new String [3];
		a[0]="ios";
		a[1]="Hive";
		System.out.println(a[0]);
		a[2]="hBase";
		for(String str:a)
		{
			System.out.println(a);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}