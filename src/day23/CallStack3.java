package day23;

public class CallStack3 {

	public static void main(String[] args) {
		father(100);

	}
	
	public static void father(int cash) {
		try {
			mother(cash);
		} catch (NotEnoughthException e) {
			System.out.println(e.getMessage());
			e.怎麼辦();
		}
		
	}
	
	public static void mother(int cash) throws NotEnoughthException{
		son(cash);
		
		
	}
	public static void son(int cash) throws NotEnoughthException {
		int breakfirst = 150;  //早餐一客
		
		if(cash - breakfirst < 0) {
			NotEnoughthException e = new NotEnoughthException("金額不足");
			throw e;
		}
		
		System.out.println("遭餐買好了");
	}

}
