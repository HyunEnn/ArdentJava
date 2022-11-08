package ch24;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> src = Arrays.asList("Box", "Robot", "Toy", "Apple");
		LinkedList<String> dest = new LinkedList<String>(src);
		
		Collections.sort(dest);
		System.out.println(dest);
		
		Collections.copy(dest, src);
		System.out.println(dest);
	}

}
