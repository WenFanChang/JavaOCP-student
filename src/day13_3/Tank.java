package day13_3;

public class Tank extends Car implements Weapon {
	
	public Tank() {
		System.out.println("Tank");
	}

	@Override
	public void shoot() {
		System.out.println("發射榴炮");
		
	}

	@Override
	void move() {
		System.out.println("用履帶走");
		
	}
	

}
