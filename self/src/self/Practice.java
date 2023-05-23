package self;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 백준코드모음 printf->scanf->Array->-control>oprator->function
		// 문제1.
//		System.out.printf("홍길동\n홍 길 동\n홍  길  동\n");
		
		// 문제3.
//		System.out.printf("제 이름은 홍길동입니다.\n제 나이는%d살이고요.\n제가 사는 곳의 번지수는 %d-%d 입니다.\n", 20, 123, 456);
		
		// 문제4
//		System.out.printf("%d * %d = %d\n", 4, 5, 20);
//		System.out.printf("%d * %d = %d\n", 7, 9, 63);
		
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
//		System.out.print("정수를 입력해주세요: ");
//		int i = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		int j = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		int k = sc.nextInt();
//		System.out.println((i-j)*(j+k)*(k/i));
		
		// array
		// 문제 1
//		int[] arr = new int [5];
//		System.out.print("정수를 입력해주세요: ");
//		arr[0] = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		arr[1] = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		arr[2] = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		arr[3] = sc.nextInt();
//		System.out.print("정수를 입력해주세요: ");
//		arr[4] = sc.nextInt();
//		int maxV=arr[0];
//		int minV=arr[0];
//		int sumV=0;
//		for(int i=0; i<arr.length; i++) {
//			sumV += arr[i];
//			if(arr[i]>maxV) {
//				maxV = arr[i];
//			}else if(arr[i]<minV) {
//				minV = arr[i];
//			}
//		}
//		System.out.println("최대값: " + maxV);
//		System.out.println("최소값: " + minV);
//		System.out.println("총합계: " + sumV);
		
		// 문제 2
//		String[] wordArray = new String [30];
//		System.out.print("단어를 입력해주세요");
//		String word = sc.next();
//		wordArray = word.split("");				// 단어를 글자별로 리스트에 넣음(string)
//		System.out.println(wordArray.length);
		
		// 문제 3
//		char[] word = new char[30];
//		System.out.print("단어를 입력해주세요");
//		word = sc.next().toCharArray();			// 단어를 글자별로 리스트에 넣음(char)
//		int maxV = (int)word[0];
//		for(int i=0; i<word.length; i++) {
//			if((int)word[i]>maxV) {
//				maxV = (int)word[i];
//			}
//		}
//		System.out.println((char)maxV);
		
		// 문제 4
//		char[] array = new char[30];
//		System.out.print("단어를 입력해주세요");
//		array = sc.next().toCharArray();
//		char[] reverse = new char[30];
//		for(int i=0; i<array.length; i++) {
//			if(array[array.length-i-1] != 0) {
//				reverse[i] = array[array.length-i-1];	// 배열이므로 인덱스는 전체길이에서 1을 빼주어야함
//				System.out.println(reverse[i]);
//			}
//		}
		
		// 문제 5
		int[] arr = new int[10];
		int sumV = 0;
		double avg;
		int num = 101;
		System.out.print("학생의 수를 입력하시오(최대 10명) > \n");
		int count = sc.nextInt();
		if(count > 10) {
			System.out.println("최대 학생수는 10명입니다.");
		}else {
			for(int i=0; i<count; i++) {
				System.out.printf("학생 %d의 성적을 입력하세요 : \n", i+1);
				num = sc.nextInt();
				arr[i] = num;
				sumV += arr[i];
			}
			avg = (double)sumV / count;
			System.out.printf("성적 평균은 %.1f 입니다.\n", avg);
		}
		
		

		
		
		
		sc.close();
	}
}
