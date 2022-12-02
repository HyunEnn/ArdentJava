package ch29;

import java.util.Arrays;
import java.util.List;

class Box<T> {
	private T ob;
	public Box(T o) { ob = o; }
	public T get() { return ob; }
}

public class prac2901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		ls.stream()
		  .map(n -> n.get())
		  .forEach(s -> System.out.println(s));
	}

}
