package day01;

import java.util.Scanner;

//計算BMI
//利用適用者輸入身高與體重來計算BMI
//並判斷 BMI 的結果
public class CalcBMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入身高:");
		double h = scanner.nextInt();
		System.out.println("請輸入體重");
		double w = scanner.nextInt();
		//計算bmi
		double bmi = w / Math.pow(h/100, 2);
		//判斷 bmi
		String result = (bmi >23) ? "過重" : (bmi <=18) ? "過輕" : "正常";
		//印出資料
		System.out.printf("身高:%.1f 體重:%.1f BMI:%.2f 判斷:%s%n", h, w, bmi,result);

	}

}
