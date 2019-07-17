class A
{
public static void main(String args[])
{
int a=5;
/*System.out.println("Helloo \t "+a);
System.out.println(a);
a++;
System.out.println(a);*/
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}
int b=a;
if(a%2==0)
{
	System.out.println("\t even");
}
else
{
System.out.println("odd");
}
for(int i=b-1;i>=2;i--)
{
	a=a*i;
}
System.out.println(a);
}
}
