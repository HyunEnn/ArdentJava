package ch29;

import java.util.Arrays;
import java.util.List;

public class ListStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Toy", "Robot", "Box");
		list.stream()
			.forEach(s -> System.out.println(s));
	}

}
