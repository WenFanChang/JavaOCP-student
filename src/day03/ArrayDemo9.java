package day03;

public class ArrayDemo9 {

	public static void main(String[] args) {

		String[] names = { "養樂多", "金蘋果" };
		int[] prices = { 12, 15 };
		int[] amounts = { 4, 3 };

		// 飲料全部買一送一
		// 請問要花多少錢? 要找多少錢? 如何找硬幣個數?
		int total = 0;
		for (int i = 0; i < prices.length; i++) {
			int paid = amounts[i] / 2 + amounts[i] % 2;
			int subtotal = prices[i] * paid;
			total = total + subtotal;
			 System.out.printf("%s %d X %d = %d%n", names[i], prices[i], paid, subtotal);
		}
		System.out.println("-------------------");
		System.out.printf("總金額: $%d%n", total);

		int cash = 100;
		int change = cash - total;
		System.out.printf("找 %d 元%n", change);
		System.out.println("-------------------");

		int fifty = change / 50;
		change = change % 50;
		int ten = change / 10;
		change = change % 10;
		int five = change / 5;
		change = change % 5;
		int one = change;
		System.out.println("硬幣個數");
		System.out.printf("50元有: %d枚%n", fifty);
		System.out.printf("10元有: %d枚%n", ten);
		System.out.printf("5元有: %d枚%n", five);
		System.out.printf("1元有: %d枚%n", one);

	}

}
