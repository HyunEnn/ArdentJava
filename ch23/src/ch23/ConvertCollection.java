package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		
		for(String s: list)
			System.out.print(s + '\t');
		System.out.println();
		
		HashSet<String> set = new HashSet<>(list);
		
		lst = new ArrayList<>(set);
		
		for(String s:lst)
			System.out.print(s + '\t');
		System.out.println();
	}

}
