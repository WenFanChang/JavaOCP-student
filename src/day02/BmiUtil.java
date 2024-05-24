package day02;

public class BmiUtil {
	// 根據所傳入的 h, w 來計算 bmi 方法
	public static double getBmi(double h, double w) {
		double bmi = w /Math.pow(h/100, 2);
		return bmi; // 將計算結果回傳
	}
	//根據所傳入的 bmi 進行診斷: 正常ㄝ, 過輕(<=18), 過胖(>23)
	public static String getResult(double bmi) {
		if(bmi > 23) {
			return "過胖";
		} else if(bmi <= 18) {
			return "過輕";
		}
		return "正常";
	}
	// 印出 bmi 資訊的方法
	public static void printBmiInfo(double h, double w) {
		double bmi = getBmi(h, w);
		String result = getResult(bmi);
		System.out.printf("身高:%.1f 體重:%.1f Bmi:%.2f 診斷:%s%n", h, w, bmi, result);
	}

	
}
