package day05;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		System.out.println(s1 == s2);
		
		s1 = s1.intern();  // 將字串放到 string pool 中
		System.out.println(s1 == s2);

	}

}
