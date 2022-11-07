package ch23;

import java.util.TreeSet;

class Person implements Comparable<Person> {	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { return name + " : " + age; }

	@Override
	public int compareTo(Person p) {
		return this.age - p.age; // 현재 값이 p의 값보다 크면 양수 
	}
	
}
public class ComparablePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> tree = new TreeSet<>();
		tree.add(new Person("YOON", 37));
		tree.add(new Person("HONG", 53));
		tree.add(new Person("PARK", 22));
		
		for(Person p: tree)
			System.out.println(p);
	}

}
