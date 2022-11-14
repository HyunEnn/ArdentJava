package ch26;

interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) { con = s; }
	public Printable getPrinter() {
		return new Printable() {
			public void print() {
				System.out.println(con);
			}
		};
//		class Printer implements Printable { // 로컬 클래스의 정의
//			public void print() {
//				System.out.println(con);
//			}
//		}
//		return new Printer();
	}
//	
//	private class Printer implements Printable { // 맴버 클래스의 정의
//		public void print() {
//			System.out.println(con);
//		}
//	}
}

public class UseMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Papers p = new Papers("서류 내용: 행복합니다. ");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
