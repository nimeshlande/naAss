package prob2;

public class Organization {
	public static void main(String[] args) {
		Manager mag = new Manager("Nimesh",10000,400);
		Labour lab = new Labour("Nimeshh",2000,200);
		
		mag.details();
		lab.details();
	}

}
