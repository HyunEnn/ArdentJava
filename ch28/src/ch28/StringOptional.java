package ch28;

import java.util.Optional;

public class StringOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
		
		os1.ifPresent(s -> System.out.println(s));
		os2.ifPresent(System.out::println);
 	}

}
