package day08;

//銀行帳戶
public class Account {
	private static final int fee = 30; //轉帳手續費  
	private String name; //戶名
	private int balance; //餘額
	
	//設定戶名的方法(name)
	void setName(String name) {
		if(name == null || name.trim().length() == 0) {
			System.out.println("戶名設定錯誤");
			return;
		}
		this.name = name.trim(); //trim() 除去字串的左右空白
	}
	
	
	
	//存款(存款金額)
	void deposit(int amount) {
		if(amount <=0) {
			System.out.println("存款金額不得 <= 0");
			return;
		}
		balance += amount; //餘額累加
		
	}
	
	//提款(提款金額)
	
	void withdraw(int amount) {
		if(amount <=0) {
			System.out.println("提款金額不得 <=0");
			return; //該方法停止
		}
		
		if(amount > balance) {
			System.out.println("提款失敗:餘額不足");
			return;
		}
		
		balance -= amount; //餘額扣底
		
	}
	
	// 轉帳(轉帳金額, 轉帳對象)
	void transfer(int amount, Account act) {
		if(amount <= 0) {
			System.out.println("轉帳失敗:轉帳金額不得<=0");
			return;
		}
		if(amount + fee > balance) {
			System.out.println("轉帳失敗: 餘額不足");
			return;
		}
		
		//balance -= amount + fee; //我方: 餘額扣底
		withdraw(amount + fee);
		act.deposit(amount); //對方: 存款	
	}
	
	//查詢(印出)帳戶餘額
	void printBalance() {
		System.out.printf("戶名: %s 餘額: %,d%n", name, balance);
	}
	
	

}
