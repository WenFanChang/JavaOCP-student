package day12;

import java.util.Arrays;
import java.util.stream.Stream;

public class WrapperDemo4 {

	public static void main(String[] args) {
		int[] scoresA = {
			Integer.valueOf(100),
			Integer.valueOf(90),
			Integer.valueOf(80)
		};
		
		Integer[] scoresB = {100, 90, 80};  // auto-boxing
		
		//利用合併串流計算組合
		int sum = Stream.concat(
						 	Arrays.stream(scoresA).boxed(),  //變為 Integer 串流
						 	Arrays.stream(scoresB))
						.mapToInt(Integer::intValue)
						.sum();
		System.out.println(sum);
		

	}

}
