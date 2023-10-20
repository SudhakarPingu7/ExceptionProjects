package exception;

public class Customize1 {
	public static void main(String[] args)throws MException,Exception {  //we cannot add multiple Exception,we can use parrent class
		String[] a= {"mani","raj","veni","mathi"};
		for(int i=0;i<a.length;i++) {
		if(a[i].startsWith("m")) {
			System.out.println("starts with m");
		}else {
			throw new MException("not starts With");  //we cannot create multiple throw
			
			
		}
		
	}

}
}class MException extends Exception {
	public MException(String m) {
		super(m);
	}
}

