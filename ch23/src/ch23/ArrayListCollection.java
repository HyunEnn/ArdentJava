package ch23;

import java.util.LinkedList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(String s: list) 
			System.out.print(s + '\t');
		System.out.println();
		
		list.remove(0);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}

}
