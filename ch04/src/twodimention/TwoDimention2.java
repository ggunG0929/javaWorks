package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char[5][5];
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				a[i][j] = '*';	// 별 문자 저장
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 삼각형 모양 만들기
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<i+1; j++) {
//				a[i][j]= '*';
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 역삼각형 모양 만들기
		// 내답, 선생님 최종답
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length-i; j++) {
//				a[i][j]= '*';
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		// 선생님답
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// 임의로 프린트 되지 않은 배열 전체값을 보려고 추가
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		/* 디버깅
		 * 
		 * a[0][0] *
		 * a[0][1] *
		 * a[0][2] *
		 * a[0][3] *
		 * a[0][4] *
		 * 최종) a의 0행 *****
		 * 
		 * a[1][1] *
		 * a[1][2] *
		 * a[1][3] *
		 * a[1][4] *
		 * 최종) a의 1행 ****
		 * 
		 * a[2][2] *
		 * a[2][3] *
		 * a[2][4] *
		 * 최종) a의 2행 ***
		 * 
		 * a[3][3] *
		 * a[3][4] *
		 * 최종) a의 3행 **
		 * 
		 * a[4][4] *
		 * 최종) a의 4행 *
		 *
		 */
		
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * */
		// 1부터 순차증가
		int[][] arr = new int[4][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				// (열의 종료값 x 행의 값) + 열의 값
				arr[i][j] = (arr[i].length*i) + (j + 1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
