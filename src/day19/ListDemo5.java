package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("可變集合 List: " + list);
		
		//創建不可修改集合
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println("不可修改集合 unmodifiableList: " + unmodifiableList);
		//unmodifiableList.add(4);  //不可以新增, 修改予刪除
		//bUT 若直接修改 list 會影響 unmodifiableList
		//因為 list 是unmodifiableList 的底層集合
		
		//創建不可變集合 ImmutableCollection
		List<Integer> immuttableList = List.copyOf(list);
		//immuttableList.add(4);  //不可以新增, 修改予刪除
		System.out.println("不可變集合 immutableList: " + immuttableList);
		
		
		System.out.println("list.add(4)");
		list.add(4);
		System.out.println("可變集合 List: " + list);
		System.out.println("不可修改集合 unmodifiableList: " + unmodifiableList);
		System.out.println("不可變集合 immutableList: " + immuttableList);
		
	}

}
