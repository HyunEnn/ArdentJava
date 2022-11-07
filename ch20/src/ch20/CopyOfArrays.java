package ch20;

import java.util.Arrays;

public class CopyOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arOrg = {1.1 , 2.2, 3.3, 4.4, 5.5};
		/*
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		
		for(double d : arCpy1)
			System.out.print(d + "\t");
		System.out.println();
		
		for(double e : arCpy2)
			System.out.print(e + "\t");
		System.out.println();
		*/
		double[] cpy = new double[3];
		
		System.arraycopy(arOrg, 1, cpy, 0, 3);
		for(double d: cpy)
			System.out.print(d + "\t");
		System.out.println();
	}

}
