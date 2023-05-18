package methods;

public class Method1 {	// public - private 공개 비공개
	
	// main() 함수
	public static void main(String[] args) {	// String형식
		// 객체(클래스에서 만드는 인스턴스) - 메모리에 로딩		
		Method1 method = new Method1();
		// 패키지이름.클래스이름@메모리주소
		System.out.println(method);
		
		// 함수 호출
		sayHello();
		
		System.out.println(square(3));

	}
	
	// sayHello() 함수 생성(return 없는 함수 - void)
	// static - 정적영역(값을 누적, 공유) new를 통하지 않는 경우(Scanner X, Math O)
	// static을 붙인 이유 - 호출하는 쪽에서 new 객체 생성을 하지 않을 때 사용
	public static void sayHello() {
		System.out.println("Hello~");
		
	}
	
	// 제곱수를 계산하는 함수(return 있는 함수 - int형으로 반환)
	public static int square(int x) {
		return x * x;
		
	}

}
