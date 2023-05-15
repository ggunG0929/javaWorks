package var;

public class Calc {

	public static void main(String[] args) {
		// 두 수의 합, 차, 곱, 나누기
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		// 정수 연산시 결과도 정수로 나옴 -> 실수 연산을 하려면 자료형을 실수로 바꿔야 함
		// double 형으로 형 변환
		System.out.println(x / (double)y);
	}

}
