package ch27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Prac2702 {
	
	public static <T> void show(Predicate <T> p, List<T> lst) {
		List<T> s = new ArrayList<>();
		for(T n : lst) {
			if(p.test(n))
				s.add(n);
		}System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst1 = Arrays.asList(1,3,8,10,11);
		show(n -> n%2 != 0, lst1);
		
		List<Double> lst2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show(n -> n>0.0, lst2);
	}

}
