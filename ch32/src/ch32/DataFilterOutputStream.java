package ch32;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFilterOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataOutputStream out =
				new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.writeInt(370);
			out.writeDouble(3.14);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
