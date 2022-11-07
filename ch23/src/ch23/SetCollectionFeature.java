package ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("�ν��Ͻ� ��: "+set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next()+'\t');
		System.out.println();
		
		for(String s: set){
			System.out.print(s +'\t');
		}System.out.println();
	}

}