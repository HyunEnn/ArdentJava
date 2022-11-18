package ch27;

import java.util.Random;

interface Generator {
	int rand();
}

public class NoParamAndReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generator gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		System.out.println(gen.rand());
	}

}
