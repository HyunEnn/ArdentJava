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
			System.out.println("���ڿ� ���� 3 �ʰ�");
		else
			System.out.println("���ڿ� ���� 3 ����");
		
		if(conv.test("Box", 5))
			System.out.println("���ڿ� ���� 5 �ʰ�");
		else
			System.out.println("���ڿ� ���� 5 ����");
		
	}

}
