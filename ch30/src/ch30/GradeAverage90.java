package ch30;

import java.util.Arrays;

class ReportCard2 {
	private int kor;
	private int eng;
	private int math;
	
	public ReportCard2(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}
	public int getKor() { return kor; }
	public int getEng() { return eng; }
	public int getMath() { return math; }
}

public class GradeAverage90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportCard2[] cards = {
				new ReportCard2(98, 84, 90),
				new ReportCard2(92, 87, 95),
				new ReportCard2(85, 99, 93)
		};
		
		boolean b1 = Arrays.stream(cards)
				.mapToDouble(r -> (r.getKor() + r.getEng() + r.getMath()) / 3.0)
				.anyMatch(avg -> avg >= 90.0);
		System.out.println("평균 90 이상이 1명 존재합니다. " + b1);
		
		Arrays.stream(cards)
				.mapToDouble(r -> (r.getEng() + r.getKor() + r.getMath()) / 3.0 )
				.filter(s -> s >= 90.0)
				.forEach(s -> System.out.println("평균점수 = " + s));
				
		
		if (b1 == true) {
			boolean b2 = Arrays.stream(cards)
					.mapToDouble(r -> (r.getEng() + r.getKor() + r.getMath() / 3.0))
					.allMatch(avg -> avg >= 90.0);
			System.out.println("모두 평균 90 이상입니다. " + b2);
		}
	}

}
