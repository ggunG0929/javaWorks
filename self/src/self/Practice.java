package self;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 백준코드모음 printf->scanf->Array->-control>oprator->function
		// 문제1.
		System.out.printf("홍길동\n홍 길 동\n홍  길  동\n");
		
		// 문제3.
		System.out.printf("제 이름은 홍길동입니다.\n제 나이는%d살이고요.\n제가 사는 곳의 번지수는 %d-%d 입니다.\n", 20, 123, 456);
		
		// 문제4
		System.out.printf("%d * %d = %d\n", 4, 5, 20);
		System.out.printf("%d * %d = %d\n", 7, 9, 63);
		
		// scan
		Scanner sc = new Scanner(System.in);
		// 문제1
//		System.out.print("정수를 입력해주세요: ");
//		int a = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		int b = sc.nextInt();
//		System.out.println("두 수의 뺄셈: " + (a-b));
//		System.out.println("두 수의 곱셈: " + (a*b));
		
		// 문제2
//		System.out.print("num1: ");
//		int c = sc.nextInt();
//		System.out.print("num2: ");
//		int d = sc.nextInt();
//		System.out.print("num3: ");
//		int e = sc.nextInt();
//		System.out.println(c + " * " + d + " + " + e + " = " + (c*d+e));
		
		// 문제3
//		System.out.print("정수를 입력해주세요: ");
//		int f = sc.nextInt();
//		System.out.println(f*f);
		
		// 문제4
//		System.out.print("정수를 입력해주세요: ");
//		int g = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		int h = sc.nextInt();
//		System.out.println("몫: " + (int)g/h);
//		System.out.println("나머지: " + g%h);
		
		// 문제5
		System.out.print("정수를 입력해주세요: ");
		int i = sc.nextInt();
		System.out.print("정수를 입력해주세요: ");
		int j = sc.nextInt();
		System.out.print("정수를 입력해주세요: ");
		int k = sc.nextInt();
		System.out.println((i-j)*(j+k)*(k/i));
		
	}

}
