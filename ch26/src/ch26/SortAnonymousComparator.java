package ch26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class StrComp implements Comparator<String> {  // 람다 이전 사용하던 자바 문법
//	@Override
//	public int compare(String s1, String s2) {
//		return s1.length() - s2.length();
//	}
//}

public class SortAnonymousComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		List<String> list2 = Arrays.asList("TOY", "ROBOT", "AIR");
		list2 = new ArrayList<>(list2);
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		Comparator<String> cmp = new Comparator<String>() { // 
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		Collections.sort(list,  cmp);
		System.out.println(list);
	}

}
