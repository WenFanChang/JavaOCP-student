package day10;

public class Supervisor extends Manager {
	private double stockOptions;

	public Supervisor(String name, int salary, int budget, double stockOption) {
		super(name, salary, budget);
		this.stockOptions = stockOption;
		
	}
	public Supervisor() {
		System.out.println("建立Supervison 物件");
		
	}

	public double getStockOptions() {
		return stockOptions;
	}

	public void setStockOptions(double stockOptions) {
		this.stockOptions = stockOptions;
	}

	@Override
	public String toString() {
		return "Supervisor [name=" + getName() + ", Salary="+ getSalary() +", budget=" + getBudget() + ", stockOptions=" + stockOptions + "]";
	}

	
}
