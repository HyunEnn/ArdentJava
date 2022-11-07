package ch23;

import java.util.ArrayDeque;
import java.util.Deque;

interface DIStack<E> {
	public boolean push(E item);

	public E pop();
} // DIStack에 push, pop을 구현

class DCStack<E> implements DIStack<E> {
	private Deque<E> deq;

	public DCStack(Deque<E> d) {
		deq = d;
	}

	public boolean push(E item) {
		return deq.offerFirst(item);
	}

	public E pop() {
		return deq.pollFirst();
	}
}// DCStack에서 DIStack의 값을 구현

public class DefinedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());

		stk.push("1.Box");
		stk.push("2.Toy");
		stk.push("3.Robot");

		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	}

}
