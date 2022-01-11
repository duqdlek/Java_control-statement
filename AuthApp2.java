
public class AuthApp2 {

	public static void main(String[] args) {

	String id = "ffofforu";
	String inputId = args[0];
	
	String pw = "11111";
	String pw2 ="12345";
	
	String inputPw = args[1];
	
	
	System.out.println("Hi.");
	
//	if(inputId.equals(id)) {	
//		if(inputPw.equals(pw)) {
//	System.out.print("Welcome");
//	}	else System.out.println("Wrong password!");
//	}
//	
//	else {
//		System.out.println("Who Are You?");
//	}
	boolean isCool = (inputPw.equals(pw) || inputPw.equals(pw2));
	if(inputId.equals(id) && isCool) {	
         System.out.print("Welcome");
    }
    else {
	System.out.println("Who Are You?");
    }
	
	}

}
