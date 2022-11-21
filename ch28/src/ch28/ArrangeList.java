package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
		ls = new ArrayList<>(ls);
		
//		Consumer<List<Integer>> c = l -> Collections.reverse(l); // accept(T t)에 관한 람다식, Collection 클래스에 reverse(List<?> list)
 		Consumer<List<Integer>> c = Collections::reverse;
		c.accept(ls);
		System.out.println(ls);
	}

}
