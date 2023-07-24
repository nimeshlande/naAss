package assignment1;

public class AmStrongNumberRange {
	public static void main(String[] args) {
		
		for(int i = 100;i<1000;i++) {
			int num = i;
			int sum =0;
			
			for(int j =0; j<3;j++) {
				int tocube=0;
				tocube = num%10;
				int cube = 0;
				cube = tocube*tocube*tocube;
				
				sum = sum+ (cube);

				num = num/10;
			
			}
			
			if(sum==i) {
				System.out.println("Armstrong Number :" + i);
			}
		}
	
		
	}

}
