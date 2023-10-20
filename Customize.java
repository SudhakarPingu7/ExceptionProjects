package exception;

public class Customize {
	public static void main(String[] args)throws AgeException  {
		String a="raj";
		int age=17;
		if(age>=18) {
			System.out.println("welcome"+a);
		}else {
			throw new AgeException("Not value");
		}
		
	}

}class AgeException extends Exception {
	public AgeException(String mesg) {
		super(mesg);
	}
}
