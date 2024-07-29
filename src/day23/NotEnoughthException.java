package day23;

//自訂例外: 不足夠例外
public class NotEnoughthException extends Exception{

	public NotEnoughthException(String errorMessage) {
		super(errorMessage);
	}
	
	// 自訂方法
	public void 怎麼辦() {
		System.out.println("看這辦...");
	}
	

}
