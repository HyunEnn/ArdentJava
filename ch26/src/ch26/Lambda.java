package ch26;

interface LPrintable {
	void print(String s);
}

//class Printer implements Printable { // 기본 인터페이스를 구현하는 클래스
//	public void print(String s) {
//		System.out.println(s);
//	}
//}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LPrintable prn = new LPrintable() { // 익명 클래스
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
