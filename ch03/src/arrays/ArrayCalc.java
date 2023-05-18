package arrays;

public class ArrayCalc {

	public static void main(String[] args) {
		// 배열의 총점과 평균
		int[] score = new int[4];
		int total = 0;
		double avg;
		
		// 90, 70, 85, 60 입력
//		score[0] = 90;
		score[0] = 80;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;

		// 총점 계산
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		
		// 평균 - double을 넣어주어야 소수점이하가 살아있음
		avg = (double)total / score.length;
		
		// 최고 점수
		int maxV = score[0];	// 첫번째 값을 최고 점수로 설정
		for(int i=1; i<score.length; i++) {
			if(maxV < score[i]) {	// 최대값이 다음 점수보다 작으면
				maxV = score[i];	// 그 점수를 최대값으로 설정
			}
		}
		
		// 출력
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("최고점수: " + maxV);
	}

}
