package ch27;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) 
			list.add(s.get()); // 최대 50인 난수 생성 
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		List<Integer> list = makeIntList(spr, 5); // 난수 5번 생성
		System.out.println(list);
		
		list = makeIntList(spr, 10); // 난수 10번 생성
		System.out.println(list);
	}

}
