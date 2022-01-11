
public class LoopArrayApp {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "ffofforu";
		users[1] = "sangyeop";
		users[2] = "dahee";

         for(int i=0; i<2; i++) {
        	 System.out.println("<li>"+users[i]+"</li>");
         } for(int i=2; i==2; i++) {
        	 System.out.println("<li>"+users[i]);
         }
    
	}

}
