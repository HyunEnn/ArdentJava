package ch26;

interface LPrintable {
	void print(String s);
}

//class Printer implements Printable { // �⺻ �������̽��� �����ϴ� Ŭ����
//	public void print(String s) {
//		System.out.println(s);
//	}
//}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LPrintable prn = new LPrintable() { // �͸� Ŭ����
//			public void print(String s) {
//				System.out.println(s);
//			}
//		};
//		
//		prn.print("What is Lambda?");
		LPrintable prn = (s) -> {System.out.println(s); };
		prn.print("What is Lambda?");
	}

}
