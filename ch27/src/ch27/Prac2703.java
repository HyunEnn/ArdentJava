package ch27;

import java.util.function.BiPredicate;

public class Prac2703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, Integer> conv = (s, i) -> {
			if(s.length() > i)
				return true;
			else
				return false;
		};
				
		if(conv.test("Robot", 3))
			System.out.println("문자열 길이 3 초과");
		else
			System.out.println("문자열 길이 3 이하");
		
		if(conv.test("Box", 5))
			System.out.println("문자열 길이 5 초과");
		else
			System.out.println("문자열 길이 5 이하");
		
	}

}
