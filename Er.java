package exception;
                            //StackOverFlowerror
public class Er {
	public static void main(String[] args) {
		Test t=new Test();
		t.a();
		
	}

}class Test {
	public void a() {
		b();
	}public void b() {
		a();
	}
}
