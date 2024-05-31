package day07;

import java.util.Arrays;

public class DrinkMain {

	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.name = "珍奶";
		drink1.amount = 1;
		drink1.price = 70;
		
		Drink drink2 = new Drink();
		drink2.name = "清茶";
		drink2.amount = 10;
		drink2.price = 40;
		
		Drink drink3 = new Drink();
		drink3.name = "紅茶";
		drink3.amount = 20;
		drink3.price = 25;
	
		Drink drink4 = new Drink();
		drink4.name = "熱可可";
		drink4.amount = 15;
		drink4.price = 55;
		
		//drink1~4 是飲料訂單
		//請問總共花費多少?
		
		Drink[] drinks = {drink1, drink2, drink3, drink4};
		
		int sum1 = 0;
		for(int i=0; i<drinks.length; i++) {
			sum1 += drinks[i].amount * drinks[i].price; 
			}
		System.out.printf("總價錢: %d%n", sum1);
		
		int sum2 = 0;
		for(Drink drink : drinks) {   //Drink drink(物件) : drinks(陣列)
			sum2 += drink.amount * drink.price; 
			
		}
		System.out.printf("總價錢: %d%n", sum2);
		
		int sum3 = Arrays.stream(drinks).mapToInt(drink -> drink.amount * drink.price).sum();
		System.out.printf("總價錢: %d%n", sum3);
		
		
		
		
		
		
		
		
	

	}

}
