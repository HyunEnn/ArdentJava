package ch27;

interface RPrintable {
	void print(String s);
}

public class Lambda_up {

	public static void ShowString(RPrintable p, String s) {
		p.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowString((s)->{ System.out.println(s); }, "What is Lambda?");
	}

}
