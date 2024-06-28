package day14;

public class McDonaldMeals {

	public static void main(String[] args) {
		Burger bigMac = new Burger("大麥克", 78);
		Burger fish = new Burger("麥香魚", 45);
		Burger buger = new Burger("小漢堡", 30);
		
		Beverage cola = new Beverage("可樂", 20, false);
		Beverage blacktea = new Beverage("紅茶", 15, false);
		Beverage coffee = new Beverage("熱咖啡", 40, true);
		
		SideMeal fries = new SideMeal("大薯", 60, 3);
		SideMeal salad = new SideMeal("沙拉", 50, 2);
		SideMeal onion = new SideMeal("洋蔥圈", 40, 1);
		
		// 組合餐
		Combo classicCombo1 = new ClassicCombo(bigMac, fries, cola);
		Combo classicCombo2 = new ClassicCombo(fish, salad, blacktea);
		Combo discountCombo = new DiscountCombo(buger, onion, coffee, 0.8);
		
		//組合餐陣列(表示使用者點了那些組合餐)
		Combo[] combos = {classicCombo1, classicCombo2, discountCombo};
		
		int total = 0;
		for(Combo combo : combos ) {
			System.out.printf("%s %s %s%n",
					combo.getBurger().getName(), 
					combo.getSideMeal().getName(),
					combo.getClass().getName(),
					combo.getPrice());
			total += combo.getPrice();
		}
		System.out.println("---------------------------");
		System.out.printf("總價 $%d%n", total);
		
		
			
			

	}

}
