package ch32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SimpleWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('วั');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
