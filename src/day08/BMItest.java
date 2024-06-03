package day08;

public class BMItest {

	public static void main(String[] args) {
		BMI FrankBmi = new BMI();
		FrankBmi.setName("法蘭克");
		
		FrankBmi.setHeight(175.0);
		
		FrankBmi.setWeight(68.0);
		
		FrankBmi.printBmi();
		
		BMI marioBmi = new BMI();
		marioBmi.setName("瑪莉歐");
		marioBmi.setHeight(140.0);
		marioBmi.setWeight(70.5);
		marioBmi.printBmi();
		
		BMI julieBmi = new BMI();
		julieBmi.setName("  茱蒂  ");
		julieBmi.setHeight(0);
		julieBmi.setWeight(0);
		julieBmi.printBmi();
		
		
		
		
		

	}

}
