package exception;

public class Null {
	public static void main(String[] args) {
		System.out.println("hi");
		String name=null;
		try {
		System.out.println(name.toLowerCase());
	}catch(Exception a) {
		System.out.println("give some String");
		System.out.println(a);
		a.printStackTrace();
	}System.out.println("bye");

}
}
