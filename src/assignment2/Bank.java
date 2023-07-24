package assignment2;

class accountHolder{
	private String name;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public accountHolder(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public void accdetails() {
		System.out.println("Name "+name );
		System.out.println("Balance "+balance);
	}
	
	
	
}

class Saving extends accountHolder{
	private double fixeddepo ;

	public double getFixeddepo() {
		return fixeddepo;
	}

	public void setFixeddepo(double fixeddepo) {
		this.fixeddepo = fixeddepo;
	}

	public Saving(String name, double balance, double fixeddepo) {
		super(name, balance);
		this.fixeddepo = fixeddepo;
	}
	
	
	
	@Override
	public void accdetails() {
		System.out.println("Saving account holder");
		System.out.println("Name :"+getName());
		System.out.println("Total Balance :"+(fixeddepo + getBalance()));
	}
	
	
	
}

class Current extends accountHolder{
	private double credit;

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public Current(String name, double balance, double credit) {
		super(name, balance);
		this.credit = credit;
	}
	
	@Override
	public void accdetails() {
		System.out.println("Current Account Holder");
		System.out.println("Name :"+getName());
		System.out.println("Total Balance :"+(credit + getBalance()));
	}
	
	
	
}

public class Bank {
	public static void main(String[] args) {
		
		Current curr = new Current("Nimesh" ,1000,500);
		Saving sav = new Saving("Saurabh",5000,500);
		
		curr.accdetails();
		System.out.println();
		sav.accdetails();
		
	}

}
