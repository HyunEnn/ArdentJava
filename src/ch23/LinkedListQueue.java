package ch23;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<>();
		que.offer("Box");
		que.offer("Toy");
		que.offer("Robot");
		
		//다음에 무엇이 나올지 확인
		System.out.println("next: " + que.peek());
		
		//첫 번째, 두 번째 인스턴스 꺼내기
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		//다음에 무엇이 나올지 확인
		System.out.println("next: " + que.peek());
		
		//마지막 인스턴스 꺼내기
		System.out.println(que.poll());
	}

}
