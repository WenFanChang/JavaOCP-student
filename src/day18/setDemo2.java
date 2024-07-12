package day18;

import java.util.HashSet;
import java.util.Set;

public class setDemo2 {
	
	public static void main(String[] args) {
		//set 元素不重複
		//透過 equal() & hashCode()的結果
		Set set1 = new HashSet();
		set1.add("Java");
		set1.add("Java");
		set1.add("OCP");
		System.out.println(set1);
		System.out.println("Java".equals("Java"));
		System.out.println("Java".hashCode());
		System.out.println("Java".hashCode());
		System.out.println("Java".hashCode());
		System.out.println("Java".equals("OCP"));
		System.out.println("OCP".hashCode());
		
	}

}
