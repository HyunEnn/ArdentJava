package ch27;

import java.util.function.BiConsumer;

class Box<T> {
	private T ob;
	public void set(T o) { ob = o; }
	public T get() { return ob; }
}

public class Prac2704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Box<Integer>, Integer> c1 = (b, i) -> b.set(i);
		BiConsumer<Box<Double>, Double> c2 = (b, i) -> b.set(i);
		
		Box<Integer> bi = new Box<>();
		Box<Double> bd = new Box<>();
		
		c1.accept(bi, 172);
		c2.accept(bd, 66.7);
		
		System.out.println(bi.get());
		System.out.println(bd.get());
	}

}
