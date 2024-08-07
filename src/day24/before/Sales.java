package day24.before;

public class Sales {
	int x;   //買
	int y;   //賣
	String name;   //商品資料  品名
	int price;  //商品資料: 價格
	int amount;  //訂購: 數量
	public Sales(int x, int y, String name, int price, int amount) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	//計算要支付費用的評述
	private int getBottles() {
		int bottles = amount / (x + y) * x + amount %(x + y);
		return bottles;
	}
	
	//應付金額
	public int getTotal() {
		int total = getBottles() * price;
		return total;
	}
	
	public void printBill() {
		System.out.printf("%s 每瓶$%d(買 %d 送 %d) 買入 %d 瓶需要花費 %d%n", name, price, x, y, amount, getTotal());
	}
	

}
