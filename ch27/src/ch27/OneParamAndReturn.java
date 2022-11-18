package ch27;

interface HowLong {
	int len(String s);
}

public class OneParamAndReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowLong hl = s -> s.length();
		System.out.println(hl.len("I am so happy"));
		
	}

}
