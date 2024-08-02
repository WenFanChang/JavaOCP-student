package day24.before;

public class SalesMain {

	public static void main(String[] args) {
		Sales sale1 = new Sales(3, 1, "錫蘭紅茶", 10, 5);
		Sales sale2 = new Sales(5, 2, "玫瑰花茶", 15, 2);
		Sales sale3 = new Sales(3, 1, "凍頂紅茶", 25, 18);
		Sales sale4 = new Sales(5, 2, "錫蘭花茶", 15, 20);
		
		sale1.printBill();
		sale2.printBill();
		sale3.printBill();
		sale4.printBill();
	}

}
