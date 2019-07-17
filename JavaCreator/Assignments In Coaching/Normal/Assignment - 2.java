class IS
 {
 	 public static void main(String args[])
   	  {
		 int a,i,temp=0,max=1,count=1;
      		 System.out.print("Numbers are:");
       		 for(i=1;i<=10;i++)
          	  {
		   	a=(int)(Math.random()*10);
           		System.out.print(" "+a);
           		if(i==1)
	      		 {		
				temp=a;
	      			continue;
			  }
	   		else
	   		 {
				if(temp<a)
			      	 {
					count++;
  	 	  			if(i==10)
		   			 {
						max=count;
					  }
				  }		
	    			 else
	       			  {
					if(max<count)
		  		        max=count;
		   			count=1;
	   			   }
	        		 temp=a;
	   		  }
	           }
 		   System.out.println();
   		   System.out.print("Length of longest increasing series is="+max);
      	  }
 }  