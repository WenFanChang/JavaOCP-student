package day23;

public class TestCalculator3A {

	public static void main(String[] args) {
		//3A 
		//A-Arrange(準備) Action(執行) Assert(斷言)
		
		//A-Arrange(準備)
		Calculator calculator = new Calculator();
		int x = 5;    //參數一  input
		int y = 3;	  //參數二  input
		int future = 8;   //期望值   output
		
		//Action(執行)
		int result = calculator.add(x, y);
		
		//Assert(斷言)
		assert(future == result): "結果於期望不符合";
		
		System.out.println("測試成功");
	}

}
