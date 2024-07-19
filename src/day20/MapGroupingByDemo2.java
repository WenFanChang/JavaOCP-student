package day20;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingByDemo2 {

	public static void main(String[] args) {
		List<String> names = List.of("John", "Jo", "Mary", "Jim", "Mark", "Bob", "Anita");
		//請利用分組產出 2個英文字母有幾個?, 3個英圳母有幾個?, 4個英圳母有幾個?, 5個英圳母有幾個?
		Map<Integer, Long> result = names.stream()
									    .collect(Collectors.groupingBy(name -> name.length(), Collectors.counting()));
		System.out.println(names);
		System.out.println(result);

	}

}
