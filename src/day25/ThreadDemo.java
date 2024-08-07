package day25;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable r1 = new SendEmail("hello@gmail.com");
		Runnable r2 = new SaveData();
		
		//建立執行緒
		Thread t1 = new Thread(r1, "email-thread");  //待執行的工作, 執行緒名稱
		Thread t2 = new Thread(r2, "save-thread");   //待執行的工作, 執行緒名稱
		
		
		//啟動執行緒
		t1.start();
		t2.start();
		
		
	}

}
