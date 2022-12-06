package ch31;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLongSequential {

	public static long fibonacci(long n) {
		if(n==1||n==2)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(40,41,42,43,44,45);
		
		Instant start = Instant.now();
		nums.stream()
			.map(n->fibonacci(n))
			.forEach(s -> System.out.println(s));
		
		Instant end = Instant.now();
		System.out.println("Sequential Processing: " +
		Duration.between(start, end).toMillis());
	}

}
