package day21;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {

	public static void main(String[] args) {
		//成績 Map 可以根據 Person 的 Name 來排序
		Person p1 = new Person("Bob", 25);
		Person p2 = new Person("Alice", 30);
		Person p3 = new Person("David", 20);
		Person p4 = new Person("Charlie", 35);
		
		Map<Person, Integer> scores = new TreeMap<>();
		scores.put(p1, 100);
		scores.put(p2, 80);
		scores.put(p3, 50);
		scores.put(p4, 75);
		System.out.println(scores);
		

	}

}
