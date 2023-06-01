package interfaceex.inheritance;

// 구현 클래스
public class MyClass implements MyInterface {	// implements

	@Override
	public void x() {
		System.out.println("x() 출력");
	}
	
	@Override
	public void y() {
		System.out.println("y() 출력");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod() 출력");
	}

}
