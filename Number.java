package exception;

public class Number {
	public static void main(String[] args) {
		String a="Tn90";
		//a.charAt(5);    String IndexOutOfBoundsException
		int[] c= {1,2,3,43};
		//System.out.println(c[5]);     ArrayIndexOutofBoundsException
		try {
			
		
		int b=Integer.parseInt(a);   //Number FormatException
		System.out.println(b);
//	} //finally {
		///System.out.println("Important message");
	}catch(Exception t) {
		System.out.println(t);
	}finally {
		System.out.println("k");  
	}
		 System.out.println("Bye");
	}

}
