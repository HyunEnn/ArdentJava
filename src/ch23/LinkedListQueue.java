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
		
		//������ ������ ������ Ȯ��
		System.out.println("next: " + que.peek());
		
		//ù ��°, �� ��° �ν��Ͻ� ������
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		//������ ������ ������ Ȯ��
		System.out.println("next: " + que.peek());
		
		//������ �ν��Ͻ� ������
		System.out.println(que.poll());
	}

}
