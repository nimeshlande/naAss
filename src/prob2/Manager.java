package prob2;

public class Manager extends Employee {

	double incentive;

	public Manager(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public void details() {
		super.details();
		System.out.println("Incentive: " + incentive);
	}

}
