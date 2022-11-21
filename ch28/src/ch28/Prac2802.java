package ch28;

import java.util.function.BiFunction;

class Box<T, U> {
	private T id;
	private U con;
	public Box(T i, U c) {
		id = i;
		con = c;
	}
	public void showIt() {
		System.out.println("ID: " + id + ", " + "Contents: " + con);
	}
}

public class Prac2802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BiFunction<Integer, String, Box<Integer, String>> bf = (i, c) -> new Box(i, c);
		BiFunction<Integer, String, Box<Integer, String>> bf = Box::new;
		Box<Integer, String> b1 = bf.apply(1, "Toy");
		Box<Integer, String> b2 = bf.apply(2, "Robot");
		b1.showIt();
		b2.showIt();
	}

}
