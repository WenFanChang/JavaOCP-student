package day16.function;

import java.util.function.Function;

/*
 @FunctionInterface
 public interface function<T, R>{
 	R apply(T t);
 }
 */
public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> func1 = (x) -> {return x.length();};
		Function<String, Integer> func2 = (x) -> x.length();
		Function<String, Integer> func3 = String::length;
		Function<String, Integer> func4 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		
		printData("Java", func1);
		printData("Oracle", func2);
		printData("OCPJP", func3);
		printData("OCPWCD", func4);
		

	}
	//設計一個 printData 可以印出 function的回傳直
	public static void printData(String data, Function<String, Integer> func) {
		int reValue = func.apply(data);
		System.out.printf("%s 有 %d 個子%n", data, reValue);
		
	}

}
