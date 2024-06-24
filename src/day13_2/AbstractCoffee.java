package day13_2;

//透過AbstractCoffee 來實現coffee
public abstract class AbstractCoffee implements Coffee {
	
	private String name;
	private String origin;
	private double price;
	private int strength;
	private String description;
	
	public AbstractCoffee(String name, String origin, double price, int strength, String description) {
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.strength = strength;
		this.description = description;
	}
	
	//沒有實現的抽象方法, 目的是要給子類實現
	public abstract double calculateCoffeine();
		
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return origin;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return strength;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	
		
		

	
}
