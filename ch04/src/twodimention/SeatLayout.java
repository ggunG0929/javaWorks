package twodimention;

import java.util.Scanner;

public class SeatLayout {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄 수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer;	// 입장객 수 저장
		int colNum = 0;		// 좌석 열 수 저장
		int rowNum = 0;		// 줄(행)의 수 연산
		
		System.out.print("입장객 수 입력: ");
		customer = sc.nextInt();
				
		System.out.print("좌석 열 수 입력: ");
		colNum = sc.nextInt();
		
		// 연산 처리(조건문) - 나누어 떨어지는 경우, 줄 수에 1을 더하는 경우
		if(customer % colNum==0) {
			rowNum = customer/colNum;	// 나누는 몫
		}else {
			rowNum = (int)(customer/colNum) + 1;	// 몫 + 1	// int를 쓰지 않아도 int값으로 나오긴 함
		}
		
		int[][] arr = new int[rowNum][colNum];
		
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<colNum; j++) {
				arr[i][j] = (colNum*i) + (j + 1);
				if(arr[i][j] > customer) {
					break;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
