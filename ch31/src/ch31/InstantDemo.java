package ch31;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant start = Instant.now();
		System.out.println("���� : " + start.getEpochSecond());
		
		System.out.println("Time flies like an arrow");
		
		Instant end = Instant.now();
		System.out.println("�� : " + end.getEpochSecond());
		
		Duration between = Duration.between(start, end);
		System.out.println("�и� �� ���� �� : " + between.toMillis());
	}

}
