package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 - "계속반복", 'n'키 - "반복중단", 이외의 키 - "지원하지 않는 키 출력"
		// key == 'y'(x, 숫자형비교시에만 쓰임) 문자열비교는 equals() 메서드 사용
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요? (y/n) ");
			
			String key = sc.nextLine();		// String형이므로 쌍따옴표를 사용
			
			if(key.equals("y")) {
				System.out.println("계속 반복");
			}else if(key.equals("n")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
