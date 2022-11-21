package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prac2801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("robot", "Lambda", "box");
		list = new ArrayList<>(list);
		Collections.sort(list, String::compareToIgnoreCase);
		System.out.println(list);
	}

}
