package ch27;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntFunction<String> f = s->s.length(); // �ܼ� Function ������ Function<String, Integer>�� ���ؼ� ���� ���, int ��ȯ�� �����Ͽ� �Է°��� String���� ����
		System.out.println(f.applyAsInt("Robot"));
		System.out.println(f.applyAsInt("System"));
	}

}
