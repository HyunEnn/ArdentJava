package ch23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// comparator�� �����Ͽ��� a.intValue()-b.intValue()�� �ϸ� ��������, b-a�� ��������
class AgeComparator implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return b.intValue() - a.intValue();
	}
}

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
//		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key ���� ������ �ִ� Set ����
		Set<Integer> ks = map.keySet();
		
		for(Integer n: ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		for(Integer n: ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		// Iterator - key`s union - HashMap ������ ����
		for(Iterator<Integer> itr = ks.iterator();itr.hasNext();)
			System.out.print(map.get(itr.next())+ '\t');
		System.out.println();
	}

}
