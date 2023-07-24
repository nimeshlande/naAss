package assignment3;

public class InsertingString {
	public static void main(String[] args) {
		StringBuffer str =new  StringBuffer("It is used to_insert her");
		String str1 = new String(" INSERTED TEXT ");
		
		int a = str.indexOf("_");
		//str.insert(a,str1);
		str.replace(a, a+1, str1);
		
		System.out.println(str.toString());
		
		
	}

}
