package day03;

public class ArrayDemo8 {

	public static void main(String[] args) {
		int price = 13; //飲料價格
		int cash = 1000;  //付現 100元
		int change = cash - price;
		System.out.printf("飲料一瓶 $%d 元%n", price);
		System.out.printf("付現金 %d 元%n", cash);
		System.out.printf("找 %d 元%n", change);
		//試問如何找? 50 = ? 10 = ? 5 = ? 1 = ?
		
		int fivehundred = change / 500;
		change = change % 500;
		int twohundred = change / 200;
		change = change % 200;
		int onehundred = change / 100;
		change = change % 100;
	    int fifty = change / 50;
		change = change % 50;
		int ten = change / 10;
		change = change % 10;
		int five = change / 5;
		change = change % 5;
		int one = change;
		
		System.out.printf("500元有: %d張%n", fivehundred);
		System.out.printf("200元有: %d張%n", twohundred);
		System.out.printf("100元有: %d張%n", onehundred);
		System.out.printf("50元有: %d枚%n", fifty);
		System.out.printf("10元有: %d枚%n", ten);
		System.out.printf("5元有: %d枚%n", five);
		System.out.printf("1元有: %d枚%n", one);
		
		
		

	}

}
