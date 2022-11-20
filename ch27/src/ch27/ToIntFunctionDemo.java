package ch27;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntFunction<String> f = s->s.length(); // 단순 Function 에서는 Function<String, Integer>를 통해서 값을 출력, int 변환을 전제하에 입력값만 String으로 받음
		System.out.println(f.applyAsInt("Robot"));
		System.out.println(f.applyAsInt("System"));
	}

}
