package ch29;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr)
			  .filter(n -> n%2 ==1)
			  .forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		sl.stream()
		  .filter(n -> n.length()==3)
		  .forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
