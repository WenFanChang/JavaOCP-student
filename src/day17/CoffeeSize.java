package day17;

public enum CoffeeSize {
	SMALL(100), MEDIUM(150), LARGE(200);
	private int ml;
	
	CoffeeSize(int ml){  //private CoffeeSize(int ml) 在enum底下都自動設定成private
		this.ml = ml;
	}
	
	public int getML() {
		return ml;
	}
}
