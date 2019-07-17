import java.io.*;
class Rations
{
	public static void main(String arfs[])
	{ 
		Ration a3,a4,a5,a6;
		    System.out.println("1. Add");
        	System.out.println("2. Subs");
        	System.out.println("3. Mult");
        	System.out.println("4. Div");
		Console con = System.console();
        System.out.println("\nWhat a operation perform choice this no");
        System.out.println("\nEnter a values"); 
        int n = Integer.parseInt(con.readLine());

            
        switch(n)
      {
      	case 1:
         {
		 	System.out.println("\nSum  is  show");
			Ration a1= new Ration();
			try
			{
			a1.read();	
			}
			catch(InvalidAmountException e)
	        {
	  			System.out.println(e.getMessage());
	 		}
			a1.show();
			Ration a2= new Ration();
			try
			{
			a2.read();	
			}
			catch(InvalidAmountException e)
	        {
	  			System.out.println(e.getMessage());
	 		}

			 
		/*	a2.show();
            a3=a1.add(a2);
			System.out.println("\nSum of :-");
			a3.show();
            System.out.println("\n-------------------------------------");
              break;
            }  

            case 2:
            {
        	System.out.println("\nSubs  is  show");
			Ration a7= new Ration();
			a7.read();
			a7.show();
			Ration a8= new Ration();
			a8.read();
			a8.show();
			a4=a7.sub(a8);
			System.out.println("\nSubs of :-");
			a4.show();
				System.out.println("\n-------------------------------------");
			break;
		    }

             case 3:
             {
          	
         	System.out.println("\nmul  is  show");
			Ration a9= new Ration();
			a9.read();
			a9.show();
			Ration a10= new Ration();
			a10.read();
			a10.show();
			a5=a9.mul(a10);
			System.out.println("\nmul of :-");
			a5.show();
				System.out.println("\n-------------------------------------");
             break;
             }

             case 4:
             {
        
          	System.out.println("\ndiv  is  show");
        	Ration a11= new Ration();
			a11.read();
			a11.show();
			Ration a12= new Ration();	
			a12.read();
			a12.show();
            a6=a11.div(a12);
			System.out.println("\ndiv of :-");
			a6.show();
			System.out.println("\n-------------------------------------");
			break;

			*/
		}
     }	
	}
}