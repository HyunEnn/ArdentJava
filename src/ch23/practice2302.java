package ch23;

import java.util.Comparator;
import java.util.TreeSet;

class IntegerComparator implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
	}
}

public class practice2302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
		tr.add(10);
		tr.add(30);
		tr.add(20);
		System.out.println(tr);
	}

}
