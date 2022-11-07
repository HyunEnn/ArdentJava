package ch20;

import java.util.Random;
import java.util.Scanner;

public class Practice201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		String [] x;
		x = c.split(" ");
		
		int x1 = Integer.valueOf(x[0]);
		int x2 = Integer.valueOf(x[1]);
		Random rnd = new Random();
		for(int i=0;i<10;i++)
			System.out.println(rnd.nextInt(x1, x2));
		
	}

}
