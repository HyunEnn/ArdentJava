package ch28;

import java.util.Optional;

public class OptionalOrElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> os1 = Optional.empty();
		Optional<String> os2 = Optional.ofNullable("So Basic");
		
		String s1 = os1.map(s -> s.toString()) // map �Լ��� map(Function<? super T, ? extends U> mapper)�� ������� �̷���� 
											   // �����̸�, ? super T���� �Է��� �ް� ? extends U���� ���� ����Ѵ�. V�� ���·� 
											   // Function ����� ����� , ��µǾ� ���� ���´� U�� ���� ���缭 ����.
					   .orElse("Empty"); // orElse ������ ������� ('''')�� ���·� ��µǰ� ����
		
		String s2 = os2.map(s ->s.toString())
					   .orElse("Empty");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
