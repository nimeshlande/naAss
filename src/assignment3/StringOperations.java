package assignment3;

public class StringOperations {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
		
		//To lowercase
		System.out.println(str.toLowerCase());
		System.out.println("------------------------------------------------------------------------------");
		
		//To uppercase
		System.out.println(str.toUpperCase());
		System.out.println("------------------------------------------------------------------------------");
		
		//replace
		System.out.println(str.replace("a", "$"));
		System.out.println("------------------------------------------------------------------------------");
		
		//contains
		System.out.println(str.contains("collection"));
		System.out.println("------------------------------------------------------------------------------");
		
		//eqauals
		System.out.println(str.equals(str2));
		System.out.println("------------------------------------------------------------------------------");
		
		//equal ignorecase
		System.out.println(str.equalsIgnoreCase(str2));
		
	}

}
