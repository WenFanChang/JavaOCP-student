package day05;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";  //String pool
		String s4 = "java";  //String pool
		String s5 = new String("jAvA");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5)); //比較時不分大小

	}

}
