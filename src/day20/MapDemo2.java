package day20;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("國", 100, "數",90, "英", 80, "社", -1);
		System.out.println(map);
		//map.put("社", 70); //不可變集合
		//利用keySet 可以取出所有的鍵值(keys)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		//利用 values() 可以取出所有內容
		List<Integer> values = new ArrayList<>(map.values());
		System.out.println(values);
		//取的總分與平均
		int sum = map.values().stream().filter(x -> x >= 0).mapToInt(x -> x.intValue()).sum();
		double avg = map.values().stream().filter(x -> x >= 0).mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
