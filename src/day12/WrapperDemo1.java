package day12;

import org.apache.commons.math3.exception.MathIllegalNumberException;

public class WrapperDemo1 {

	public static void main(String[] args) {
		//外包類
		int max = Integer.MAX_VALUE;  //取得int最大值
		System.out.println(max);
		
		int x = 10;
		int y = 20;
		int z = Integer.max(x, y);  //取得x,y的最大值
		System.out.println(z);
		
		int sum = Integer.sum(x, y);   //取得x + y 的總和
		System.out.println(sum);
		
		//使用外包類來運算(Java 5.0以前的方式)
		Integer a = Integer.valueOf(50);   //Integer 物件
		Integer b = Integer.valueOf(60);   //Integer 物件
		int c = a.intValue() + b.intValue();   //計算 a+b
		//      取出a 的int值    取出b的int值
		System.out.println(c);
		//使用外包類來運算(Java 5.0以後的方式)
		Integer d = 50;  //auto-boxing '相當於Integer d = (Integer.valueof(50);
		Integer e = 60;  //auto-boxing '相當於Integer e = (Integer.valueof(50);
		int f = d + e;   //auto-unboxing '相當於Int f = d.intvale() + e.intvalue(); 
		System.out.println(f);
		
		
		
		
	}

}
