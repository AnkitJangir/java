

public class Money2 {
        private int rs,paisa;
 
     public String toString()
     {
     	return rs+"."+paisa;
     }
    public boolean equals(Object o)
    	 {
    	 	if(o==null)
    	 		return false;
    	 		Money2 m=(Money2)o;
    	 		if(rs==m.rs&&paisa==m.paisa)
    	 			return true;
    	 			else
    	 				return false;
    }
    

    public static void main(String[] args)
    	 {
    	 	Money2 m1=new Money2();
    	 	Money2 m2=new Money2();
    	 	if(m1==m2)
    	 		System.out.println("Shallow");
    	 		if(m1.equals(m2))
    	 			System.out.println("Deep ");
    }
}
