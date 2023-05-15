package hello;

public class Hellojava {

	public static void main(String[] args) {
		// println() - 줄바꿈되며 출력
		/*
		 * 여러 줄 주석 
		 * 작성자: 김그린
		 * 자료형: 숫자, 문자, 불리언, 배열
		 */
		System.out.println("Hello~ Java!");
		System.out.println(2.54);
		System.out.println(10 > -10);	// 불리언(boolean) - true
		System.out.println(10+11);
		// 한 문자는 홑따옴표, 여러 문자는 쌍따옴표를 사용
		System.out.println(10+'1'); // 아스키코드로 계산됨 - 아스키코드1=49
		System.out.println(10+"1");	// 큰 자료형으로 형변환(숫자)
	}	// main() 닫기
	
}	// class 닫기 - class 이름은 첫글자를 대문자로 씀
