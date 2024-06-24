package day13_2;

public class Espresso extends AbstractCoffee{

	public Espresso(String name, String origin, double price, int strength, String description) {
		super(name, origin, price, strength, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCoffeine() {
		// TODO Auto-generated method stub
		return getStrength() * 40;
	}
	
	

}
