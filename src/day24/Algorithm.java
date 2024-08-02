package day24;

public class Algorithm {

	public static void main(String[] args) {
		//銷售策略: 買 x 送 y
		int x = 3;   //買
		int y = 1;   //送
		//----商品資料-------------------
		String name = "錫蘭紅茶";   
		int price = 10;   //飲料價格
		//----訂購狀況-------------------
		int amount = 5;   //買入數量
		//----計算要支付費用的評述----------
		int bottles = amount / (x + y) * x + amount %(x + y);
		
		//----應付金額-------------------
		int total = bottles * price;
		
		System.out.printf("%s 每瓶$%d(買 %d 送 %d) 買入 %d 瓶需要花費 %d", name, price, x, y, amount, total);

	}

}
