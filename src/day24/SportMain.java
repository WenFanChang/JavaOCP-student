package day24;

public class SportMain {

	public static void main(String[] args) {
		
		SportThread st1 = new SportThread();
		SportThread st2 = new SportThread();
		//SportThread st3 = new SportThread();
		
		st1.setName("烏龜");
		st2.setName("兔子");
		//st3.setName("John");
		
		//st1.setPriority(10);
		//st2.setPriority(1);
	
		st1.start();
		st2.start();
		//st3.start();    //不可重複調用 start()
		
		//st1.run();    //是單純的調用物方法, 並無使用到多執行緒機制
		//st2.run();

	}

}
