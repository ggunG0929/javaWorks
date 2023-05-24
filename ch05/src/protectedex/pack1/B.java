package protectedex.pack1;

public class B {
	
	// 같은 패키지 내에서는 protected도 접근 가능
	public void method() {
		A a = new A();
		a.field = "ok";
		a.method();
	}

}
