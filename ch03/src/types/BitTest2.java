package types;

public class BitTest2 {

	public static void main(String[] args) {
		// 비트 논리 연산자
		int num1 = 5;	// 00000101
		int num2 = 10;	// 00001010
		int num3 = 7;	// 00000111 임의로 추가해서 계산해봄
		int result1, result2, result3;
		
		// 비트 연산을 하면 2진수로 변환해서 연산하고 값을 10진수로 반환하는 듯, 10진수일 때와 값이 다름
		result1 = num1 & num2;	// 비트 논리곱(둘 다 1일때만 1)
		result2 = num1 | num2;	// 비트 논리합(둘 중 하나만 1이어도 1, 둘 다 1이어도 1)
		
		System.out.println(result1);	// 00000000 -> 0
		System.out.println(result2);	// 00001111 -> 15
		

		result3 = num3 | num2;	// 비트 논리합 임의로 추가해서 계산해봄
		System.out.println(result3);	// 00001111 -> 15(10과 5를 더해도, 7을 더해도 값이 같게 나옴)

		// 비트 이동(shift) 연산자
		// << - 왼쪽 시프트, >> - 오른쪽 시프트
		// 00000101 <<2 ----> 00010100 (20)
		// 00000101 >>2 ----> 00000001 (1)
		
		int val = 2;	// 00000010
		System.out.println(val << 1);	// 00000100 (4)
		System.out.println(val << 2);	// 00001000 (8)
		System.out.println(val >> 1);	// 00000001 (1)
		System.out.println(val >> 2);	// 00000000 (0)
		
	}

}
