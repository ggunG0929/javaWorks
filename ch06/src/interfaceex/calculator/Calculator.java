package interfaceex.calculator;

public interface Calculator {	// class가 아닌 interface : 모든 메서드는 추상메서드이지만 abstract는 생략 / 변수선언 외에도 상수선언 가능
	// 정수형 계산기
	// 인터페이스는 변수를 컴파일 과정에서 상수로 변환함
	// final 생략되어 있음
	int ERROR = -9999;		// 상수선언
	
	// 거의 추상 메서드임
	int add(int n1, int n2);
	
	int subtract(int n1, int n2);
	
	int times(int n1, int n2);
	
	int divide(int n1, int n2);
}
