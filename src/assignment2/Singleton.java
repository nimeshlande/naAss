package assignment2;

public class Singleton {

	String name ;

	private static Singleton s;

    private Singleton() {
    	name = "Hello";
}

	static Singleton getInstance() {

		if (s == null) {
			s = new Singleton();
			}
		return s;

	}

}

//can not extend 
class Inherit extends Singleton{
	
}