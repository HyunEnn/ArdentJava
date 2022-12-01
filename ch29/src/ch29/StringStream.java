package ch29;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"YOON", "LEE", "PARK"};
//		Stream<String> stm = Arrays.stream(names);
//		stm.forEach(s -> System.out.println(s));
//		
		Arrays.stream(names)
			  .forEach(s -> System.out.println(s));
	}

}
