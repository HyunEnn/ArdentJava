package ch30;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveSortedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(3, 9, 4, 2)
				 .sorted((s1, s2) -> s2.compareTo(s1))
				 .forEach(d -> System.out.print(d + "\t"));
		System.out.println();
		
		DoubleStream.of(3.3, 6.2, 1.5, 8.3)
					.sorted()
					.forEach(d -> System.out.print(d + "\t"));
		System.out.println();
	}

}
