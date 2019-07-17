class Order3
 {
	 public static void main(String args[])
    	  {
 		 int a,i,j,k,l;
      		 a=(int)(Math.random()*10);
      		 System.out.println("a="+a);
		 for(i=1;i<=a;i++)
	   	  {
			 for(j=i;j<a;j++)
			 System.out.print(" ");
		         for(k=1;k<=i;k++)
			 System.out.print(k);                      
	     		 for(l=i-1;l>0;l--)
			 System.out.print(l);
                         System.out.println();

	           }   
          }
  }