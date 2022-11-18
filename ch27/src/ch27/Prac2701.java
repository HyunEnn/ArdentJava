package ch27;

interface BCalculate<T> {
	T cal(T a, T b);
}


public class Prac2701 {
	public static <T> void calAndShow(BCalculate <T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCalculate<Integer> ci = (a, b) -> a + b; 
		calAndShow(ci,3, 4);
		
		BCalculate<Double> cd = (a, b) -> a + b;
		calAndShow(cd, 2.5, 7.1);
		
		BCalculate<Integer> ci2 = (a, b)-> a - b;
		calAndShow(ci2, 4, 2);
		
		BCalculate<Double> cd2 = (a, b) -> a - b;
		calAndShow(cd2, 4.9, 3.2);
	}	

}
