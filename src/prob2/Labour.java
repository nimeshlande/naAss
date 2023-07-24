package prob2;

public class Labour  extends Employee{
	
	private double overtime ;

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}

	public Labour(String name, double salary, double overtime) {
		super(name, salary);
		this.overtime = overtime;
	}
	
	@Override
    public void details() {
        super.details();
        System.out.println("Overtime: " + overtime);
    }

}
