package ch28;

import java.util.function.Function;

public class StringMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Function<char[], String> f = ar -> {
//			return new String(ar);
//		}; // 1�� ���ٽ�
//		Function<char[], String> f = ar -> new String(ar); // 2�� ���ٽ�
		Function<char[], String> f = String::new; // 3�� ���ٽ��ε� �ν��Ͻ��� ���� �� ���� ���� ��ȯ�� ��쿡�� ��ó�� ���ϼ� �ִ�.
		
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}

}
