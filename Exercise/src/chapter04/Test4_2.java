package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		// '혼자 공부하는 자바' 161쪽 챕터4의 확인문제
		// 문제 1: 반복문의 종류 - for, while,
		// 문제 2
		int sumV = 0;
		for(int i=1; i<101; i++) {
			if(i%3 == 0) {
				sumV += i;
			}
		}
		System.out.println(sumV);
		System.out.println();
		
		// 문제 3
		while(true) {
			int 눈1 = (int) (Math.random()*6 + 1);
			int 눈2 = (int) (Math.random()*6 + 1);
			System.out.printf("(%d, %d)\n", 눈1, 눈2);
			if(눈1 + 눈2 == 5) {
				break;
			}
		}
		System.out.println();
		
		// 문제 4
		for(int i=1; i<11; i++) {
			for(int j=1; j<11; j++) {
				int calc = (4*i) + (5*j);
				if(calc == 60) {
					System.out.printf("(%d, %d)\n", i, j);	
				}
			}
		}
		System.out.println();
		
		// 문제 5
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 문제 6
		// 내답
		String arr[][] = new String[4][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i+j>=3) {
					arr[i][j] = "*";
				}else {
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		// 내답 수정. 배열없이 프린트만, if문 변경
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				String text = (i + j >= 3) ? "*" : " ";
				System.out.print(text);
			}
			System.out.println();
		}
		System.out.println();
		
		// 선생님답 방법1
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 선생님답 방법2
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
