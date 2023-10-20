package exception;

public class StMc {
  public static void main(String[] args) {
	String a="hari";                               //single try with multiple catch
	String b=null;
	int v=10;
	int w=0;
	try {
		//System.out.println(a.charAt(8));
		//System.out.println(b.toLowerCase());
		//System.out.println(v/w);
		Integer.parseInt(a);
	}catch(NullPointerException a1) {
		System.out.println("the value is Null");
	}catch(ArithmeticException b1) {
		System.out.println("cant divide by zero");
		
	}catch(NumberFormatException c) {
		System.out.println("give some number");
		
	}catch(Exception d) {
		System.out.println("solved");
	}
}
}
