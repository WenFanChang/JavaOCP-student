package day17;

public enum USCurrency {
	
	PENNY(1), NICKLE(5), DIM(10), QUARTER(25); //大小寫都可以但大致上都用大寫
	
	private int value;
	
	private USCurrency(int value) {		
		
		this.value = value;
	
		
	}
	
	public int getValue() {
		return value;
	}

}
