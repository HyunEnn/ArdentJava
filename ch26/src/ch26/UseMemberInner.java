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
//		class Printer implements Printable { // ���� Ŭ������ ����
//			public void print() {
//				System.out.println(con);
//			}
//		}
//		return new Printer();
	}
//	
//	private class Printer implements Printable { // �ɹ� Ŭ������ ����
//		public void print() {
//			System.out.println(con);
//		}
//	}
}

public class UseMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Papers p = new Papers("���� ����: �ູ�մϴ�. ");
		Printable prn = p.getPrinter();
		prn.print();
	}

}
