package ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Car {
	protected int disp;
	public Car(int d) { disp = d; }
	
	@Override
	public String toString() { return "cc: " + disp; }
}

class CarComp implements Comparator<Car> {
	@Override 
	public int compare(Car o1, Car o2) {
		return o1.disp - o2.disp;
	}
}

//class Car implements Comparable<Car>{
//	protected int disp;
//	
//	public Car(int d) { disp = d; }
//	
//	@Override
//	public String toString() {
//		return "cc: " + disp;
//	}
//	@Override
//	public int compareTo(Car o) {
//		return disp - o.disp;
//	}
//}

class ECar extends Car {
	private int battery;
	
	public ECar(int d, int b) {
		super(d);
		battery = b;
	}
	
	@Override
	public String toString() {
		return "cc: " + disp + ", ba: " + battery;
	}
}

public class CarSortCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> clist = new ArrayList<>();
		clist.add(new Car(1800));
		clist.add(new Car(1200));
		clist.add(new Car(3000));
		
		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(1200, 99));
		elist.add(new ECar(3000, 55));
		elist.add(new ECar(1800, 87));
		
		CarComp comp = new CarComp();
		Collections.sort(clist, comp);
		Collections.sort(elist, comp);
		
		for(Iterator<Car> itr = clist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString() + '\t');
		System.out.println();
		
		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
			System.out.println(itr.next().toString() + '\t');
	}

}
