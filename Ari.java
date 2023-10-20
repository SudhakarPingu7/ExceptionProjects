package exception;

public class Ari {                    //Arithmetic exception
   public static void main(String[] args) {
	System.out.println("hi");
	int a=10;
	int b=0;
	try {
	System.out.println(a/b);    //this only throw the Exception
	}
	catch(Exception c) {
		//System.out.println("dont divide by zero");
		System.out.println(c);
		c.printStackTrace();
		
	}
	System.out.println("Bye");
	System.out.println("hi");
}
}
