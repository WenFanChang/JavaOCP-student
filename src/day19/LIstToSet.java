package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LIstToSet {

	public static void main(String[] args) {
		List<String> emaiList = new ArrayList<>();
		emaiList.add("John@email.com");
		emaiList.add("Mary@email.com");
		emaiList.add("John@email.com");
		emaiList.add("John@email.com");
		System.out.println(emaiList);
		
		//使用 stream 將 list 轉set
		Set<String> emails = emaiList.stream().collect(Collectors.toSet());
		System.out.println(emails);
	}

}
