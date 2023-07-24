package assignment3;

public class AppendStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("String Buffer ");
		StringBuffer str1 =new StringBuffer("is peer class ");
		StringBuffer str2 = new StringBuffer("of java.");
		
		str.append(str1);
		str.append(str2);
		System.out.println(str);
	}

}
