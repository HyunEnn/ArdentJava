package ch28;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Box", "Robot");
		ls.forEach(s -> System.out.println(s));
		ls.forEach(System.out::println);
	}

}
