package ch27;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Pineapple");
		c.accept("StrawBerry");
	}

}
