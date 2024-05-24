package day03;

public class ArrayDemo6 {

	public static void main(String[] args) {
		// 飲料,價格,數量
		String[] names = {"可樂", "紅茶", "咖啡"};
		int[] prices = {25, 15, 45};
		int[] amouts = {3, 5, 9};

		//請印出 
		//結帳明細
		//---------------
		//可樂 $25元 X 3 =75
		//紅茶 $15元 X 5 =75
		//咖啡 $45元 X 9 =405
		//----------------
		int total = 0; //總金額
		for(int i=0; i<names.length; i++) {
			int subtotal = prices[i] * amouts[i];
			total = total + subtotal; //總金額是每次小計的累加
			System.out.printf("%s %d x %d = %d%n", names[i], prices[i], amouts[i], subtotal);
		}
		System.out.println("-------------------");
		System.out.printf("總金額: $%d%n", total);
		
		
		

	}

}
