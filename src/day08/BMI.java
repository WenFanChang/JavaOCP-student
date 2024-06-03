package day08;

public class BMI {
	//統一參數
	private static String NORMAL = "正常";
	private static String OVERWEIGHT = "過重";
	private static String UDERWEIGHT = "過輕";
	private static int MAX = 23;
	private static int MIN = 18;
	
	private String name;
	private double height;
	private double weight;
	
	//使用這名稱
	void setName(String name) {
		this.name = name;
		if(name == null || name.trim().length() == 0) {
			System.out.println("名子設定錯誤");
			return;
		}
		this.name = name.trim(); //trim() 除去字串的左右空白
	}
	
	void setHeight(double height) {
		this.height = height;
		/*
		if(height <=0) {
			System.out.println("身高:輸入錯誤");
			return;
		}
		*/
	}
	
	void setWeight(double weight) {
		this.weight = weight;
		/*
		if(weight <=0) {
			System.out.println("體重:輸入錯誤");
			return;
		}
		*/
	}
	
	
	void printBmi() {
		double bmi = getBmi();
		String result = getResult(bmi);
		System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f 診斷: %s%n ", 
				name, height, weight, bmi, result);
		
	}
	
	private double getBmi() {
		//Bmi算法
		double bmi = weight / Math.pow(height/100, 2);
		return bmi;
	}
	
	private String getResult(double bmi) {
		String result = bmi > MAX ? OVERWEIGHT : bmi <= MIN ? UDERWEIGHT : NORMAL;
		return result;
		
	}
	
	

}
