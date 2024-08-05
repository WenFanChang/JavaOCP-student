package day25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadBatchDemo {

	public static void main(String[] args) {
		// 多筆發送
		String[] emailAddresses = {
				"a1@email.com",
				"b2@email.com",
				"c3@email.com",
				"d4@email.com",
				"e5@email.com",
		};
		
		//建立執行緒池, 便設定固定數量的執行緒
		//ExecutorService executor = Executors.newFixedThreadPool(3); 
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//將任務交給執行緒"池"
		for(String emailAddress : emailAddresses) {
			executor.submit(new SendEmail(emailAddress));
		}
		
		
		//關閉執行緒池
		executor.shutdown();
		
	}

}
