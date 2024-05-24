package day03;

public class ArrayDemo7 {

	public static void main(String[] args) {
		//飲料每一送一
		String[] names = {"Fin運動飲料", "柳橙汁(大)"};
		int[] prices = {25, 75};
		int[] amount = {4, 2};
		// 請計算本次消費金額 = ?
		int total = 0;
		for(int i=0; i<names.length; i++) {
			int paid= amount[i] / 2 + amount[i] % 2;
			int subtotal = prices[i] * paid;
			total = total + subtotal;
			System.out.printf("%s %d X %d = %d%n", names[i], prices[i], paid, subtotal);
		}
		System.out.println("-------------------");
		System.out.printf("總金額: $%d%n", total);
		

	}

}
