package day13;

//Latte 實現 Coffee 的介面規格
public class Latte implements Coffee{
	private String name;
	private String origin;
	private double price;
	private int strength;
	private String description;
	
	public Latte(String name, String origin, double price, int strength, String description) {
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.strength = strength;
		this.description = description;
	}

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
