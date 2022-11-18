package ch27;

interface Calculate {
//	void cal(int a, int b);
	int cal(int a, int b);
}

public class TwoParamNoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c;
		c = (a, b) -> { return a + b; };
		System.out.println(c.cal(4, 3));
		
		c = (a, b) -> a + b;
		System.out.println(c.cal(4, 3));
//		c = (a, b) -> System.out.println(a + b);
//		c.cal(4, 3);
//		
//		c = (a, b) -> System.out.println(a - b);
//		c.cal(4, 3);
//		
//		c = (a, b) -> System.out.println(a * b);
//		c.cal(4, 3);
	}

}
