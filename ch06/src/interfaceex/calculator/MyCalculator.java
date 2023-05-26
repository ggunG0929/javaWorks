package interfaceex.calculator;

// 구현 클래스
public class MyCalculator implements Calculator{	// add unimplement

	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		return n1-n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1*n2;
	}

	@Override
	public int divide(int n1, int n2) {
		// 분모가 0인 경우 오류를 반환
		if(n2 != 0) {
			return n1/n2;
		}else {
			return Calculator.ERROR;	// 상수접근이라 직접접근
		}
	}

}
