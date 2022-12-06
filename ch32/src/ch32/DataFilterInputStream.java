package ch32;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFilterInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataInputStream in =
				new DataInputStream(new FileInputStream("data.dat"))) {
			int num1 = in.readInt();
			double db1 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(db1);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
