package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
}

public class StringBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		
		StrComp comp = new StrComp(); // 정렬과 탐색의 기준을 설정함
		Collections.sort(list, comp);
		int idx = Collections.binarySearch(list, "Robot", comp); // list를 꺼내서 , Key값인 Robot을 comp라는 기준에 넣어서 비교함.
		System.out.println(list.get(idx));
	}

}
