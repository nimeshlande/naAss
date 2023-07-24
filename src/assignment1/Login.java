package assignment1;
import java.util.*;

public class Login {
	public static void main(String[] args) {
		String userid = "Admin";
		String password = "admin";
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=0;i<3;i++) {
			System.out.println("Enter used id :");
			String user = sc.next();
			System.out.println("Paasword :");
			String pass =sc.next();
			
			if(userid.equals(user) && password.equals(pass)) {
				System.out.println("Welcome "+userid);
				break;
			}
			count++;
		}
		if(count>=3) {
			System.out.println("Contatct Admin");
		}
		
		
		
		
		sc.close();
		
	}

}
