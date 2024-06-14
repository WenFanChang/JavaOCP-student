package day10;


class Father{
	Father(char c){
		System.out.println(c);
	}
	
	Father(){
		System.out.println("A");
	}
	
}

class Son extends Father {
	 Son() {
		 super('C');
		 // super();   ans:A,B
		 System.out.println("B");
	}
	
}
public class ExtendsTest3 {

	public static void main(String[] args) {
		Son son = new Son();

	}

}
