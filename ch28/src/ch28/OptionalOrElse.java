package ch28;

import java.util.Optional;

public class OptionalOrElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> os1 = Optional.empty();
		Optional<String> os2 = Optional.ofNullable("So Basic");
		
		String s1 = os1.map(s -> s.toString()) // map 함수는 map(Function<? super T, ? extends U> mapper)를 기반으로 이루어진 
											   // 내용이며, ? super T에서 입력을 받고 ? extends U에서 값을 출력한다. V자 형태로 
											   // Function 기능이 수행됨 , 출력되어 지는 형태는 U에 따라서 맞춰서 나옴.
					   .orElse("Empty"); // orElse 구문은 비었으면 ('''')의 형태로 출력되게 설정
		
		String s2 = os2.map(s ->s.toString())
					   .orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
