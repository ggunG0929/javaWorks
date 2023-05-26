package algo;

import java.util.Random;
import java.util.Scanner;

public class Algo1 {
	public static void main(String[] args) {
		// 백준코드모음 printf->scanf->Array
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
//		int[] arr = new int[10];
//		int sumV = 0;
//		double avg;
//		int num;
//		System.out.print("학생의 수를 입력하시오(최대 10명) > \n");
//		int count = sc.nextInt();
//		if(count > 10) {
//			System.out.println("최대 학생수는 10명입니다.");
//		}else {
//			for(int i=0; i<count; i++) {
//				while(true) {
//					System.out.printf("학생 %d의 성적을 입력하세요 : \n", i+1);
//					num = sc.nextInt();
//					if(num>100 | num<0) {
//						System.out.println("잘못된 성적입니다. 다시 입력하시오.");
//					}else {
//						break;
//					}
//				}
//				arr[i] = num;
//				sumV += arr[i];
//			}
//			avg = (double)sumV / count;
//			System.out.printf("성적 평균은 %.1f 입니다.\n", avg);
//		}
			
		// 문제 6
//		int[] arr = new int[10];
//		for(int i=0; i<10; i++) {
//			arr[i] = 0;
//		}
//		for(int i=0; i<10; i++) {
//			System.out.println("1~100 사이의 정수를 입력해주세요");
//			int num = sc.nextInt();
//			if(num>90) {
//				arr[9]++;
//			}else if(num>80) {
//				arr[8]++;
//			}else if(num>70) {
//				arr[7]++;
//			}else if(num>60) {
//				arr[6]++;
//			}else if(num>50) {
//				arr[5]++;
//			}else if(num>40) {
//				arr[4]++;
//			}else if(num>30) {
//				arr[3]++;
//			}else if(num>20) {
//				arr[2]++;
//			}else if(num>10) {
//				arr[1]++;
//			}else {
//				arr[0]++;
//			}
//		}
//		for(int i=0; i<10; i++) {
//			System.out.printf("%2d - %d : ", ((i*10)+1), ((i+1)*10));
//			for(int j=0; j<arr[i] ; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
			
		// 문제 7
//		int[] arr = new int[10];
//		while(true) {
//			System.out.print("좌석을 예약하시겠습니까(1(Y) 또는 0(N))? > ");
//			char answer = sc.next().charAt(0);
//			if(answer == '1' | answer == 'Y' | answer == 'y' ) {
//				System.out.println("현재의 예약 상태는 다음과 같습니다.");
//				System.out.println("--------------------------------");
//				System.out.println("좌석 번호 : 1 2 3 4 5 6 7 8 9 10");
//				System.out.println("--------------------------------");
//				System.out.printf("예약 상태 : %d %d %d %d %d %d %d %d %d %d\n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
//				while(true) {
//					System.out.print("몇번째 좌석을 예약하시겠습니까? > ");
//					int choice = sc.nextInt();
//					if(arr[choice-1] == 1) {
//						System.out.println("죄송합니다. 이미 예약된 좌석입니다. 다른 좌석을 선택해 주세요.");
//					}else {
//						System.out.printf("%d번 좌석 예약되었습니다.\n", choice);
//						arr[choice-1] = 1;
//						break;
//					}
//				}
//			}else {
//				System.out.println("예약을 종료합니다.");
//				break;
//			}
//		}
		
		sc.close();
		// 문제 8
//		int[] arr1 = {10, 20, 30, 40, 50}; 
//		int[] arr2 = {1, 2, 3, 4, 5};
//		int[] arr3 = new int[5];
//		for(int i=0; i<5; i++) {
//			arr3[i] = arr1[i] + arr2[4-i];
//			System.out.println(arr3[i]);
//		}
			
		// 문제 9
		int[] arr = new int[25];
			
		// 문제 10
//		int[][] arr2 = new int[5][5];
			
		// 문제 11		// 성호씨한테 설명듣고 만들어봄
//		int[][] arr = new int[5][5];
//		int i = -1;		// 첫조건에 맞게 수정, [i+1][j]를 [0][0]으로 하기위해서
//		int j = 0;
//		int c = 1;
//		while(c<=arr.length * arr[0].length) {		// 배열의 크기에 맞게 마지막 수가 지정되게 임의로 지정함
//			// 반시계 방향으로 돌기위해 아래로(i++), 우로(j++), 위로(i--), 좌(j--)로 움직여야 함
//			// 옮길 좌표가 배열을 벗어나지 않을 경우 && 비어있는 경우에 값을 넣어주고 while조건을 벗어나면 다른 while조건으로 넘어감
//			while(i+1<arr.length && arr[i+1][j] == 0) {
//				i++;
//				arr[i][j] = c;
//				c++;
//			}
//			while(j+1<arr[0].length && arr[i][j+1] == 0) {
//				j++;
//				arr[i][j] = c;
//				c++;
//			}
//			while(i-1>=0 && arr[i-1][j] == 0) {
//				i--;
//				arr[i][j] = c;
//				c++;
//			}
//			while(j-1>=0 && arr[i][j-1] == 0) {
//				j--;
//				arr[i][j] = c;
//				c++;
//			}
//		}
//		// 출력
//		for(i=0; i<arr.length; i++) {
//			for(j=0; j<arr[0].length; j++) {
//				System.out.printf("%3d\t", arr[i][j]);
//				}
//			System.out.println();
//			}
		
	}

}
