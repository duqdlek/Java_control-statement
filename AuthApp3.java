/*public class AuthApp3 {

	public static void main(String[] args) {
		//String[] users = {"ffofforu", "dahee", "sangyeop"};
		String[][] users = {
			    {"ffofforu","1234"},
				{"dahee", "1234"},
				{"sangyeop","1234"}
	};
		String inputId = args[0];
		String inputPw = args[1];
		
	boolean isLogined = false;
       for(int i=0; i<users.length; i++) {
    	   String[] current = users[i];
    	   if(
    			   current[0].equals(inputId) &&
    			   current[1].equals(inputPw)                       //아이디와 비번이 같다면
    			   
    			   ) {
    		  isLogined = true;
    		  break; 
    	   }
     }
     System.out.println("Checked");  
       if(isLogined) {
    	   System.out.println("Success for Login");
       }else {
    	   System.out.println("Failed");
       }
	}

}
*/

public class AuthApp3 {

	public static void main(String[] args) {
 String[][] users={
		 {"ffofforu", "1234"},
		 {"dahee", "1234"},
		 {"sangyeop", "1234"}
 };
 
         String inputId=args[0];
		 String inputPw=args[1];
		 
		 boolean isLogined = false;
		 for(int i=0; i<users.length; i++) {
				 String[]current = users[i];
				 if(
						 current[0].equals(inputId) && 
						 current[1].equals(inputPw)
						 )
				 {
		           isLogined = true;
		           break;
		         }
		 };
		 System.out.println("Checking");
		 if(isLogined)	{
			 System.out.println("Success");
		 }else {
			 System.out.println("Failed Login");
		 
		 }
	
  }
}