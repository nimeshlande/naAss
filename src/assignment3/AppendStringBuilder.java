package assignment3;

public class AppendStringBuilder {
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("String Builder ");
		StringBuilder str1 =new StringBuilder("is peer class ");
		StringBuilder str2 = new StringBuilder("of java which is faster");
		
		str.append(str1);
		str.append(str2);
		System.out.println(str);
		

	}

}
