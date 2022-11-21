package ch28;

import java.util.function.Function;

public class StringMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Function<char[], String> f = ar -> {
//			return new String(ar);
//		}; // 1번 람다식
//		Function<char[], String> f = ar -> new String(ar); // 2번 람다식
		Function<char[], String> f = String::new; // 3번 람다식인데 인스턴스의 생성 및 참조 값의 반환일 경우에는 위처럼 줄일수 있다.
		
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}

}
