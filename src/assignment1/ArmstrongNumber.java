package assignment1;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int comp =num;
		int sum = 0;
		
		String s = String.valueOf(num);
		
		for(int i =0; i<s.length();i++) {
			int tocube=0;
			tocube = num%10;
			int cube = 0;
			cube = tocube*tocube*tocube;
			
			sum = sum+ (cube);

			num = num/10;
		
		}
		
		if(sum==comp) {
			System.out.println("Armstrong number !");
		}else {
			System.out.println("Not a armstrong number !");
		}

		
		

		
		
		
		
		
		
		
		sc.close();
	}

}
