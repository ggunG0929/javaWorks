package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 배열을 이용한 성적 처리(입력)
		Scanner sc = new Scanner(System.in);
		boolean run = true;		// 상태 변수
		int[] scores = null;	// 배열 변수 초기화: null
		
		while(run) {
			try {
				System.out.println("--------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				
				if(selectNo == 1) {
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];	// 배열의 크기는 학생수임
				}else if(selectNo == 5) {
					run = false;	// 상태를 변경
					System.out.println("프로그램을 종료합니다.");
					
				}else if(selectNo == 2 || selectNo == 3 || selectNo == 4) {
					if(scores == null) {	// 학생 수를 입력되지 않았다면
						System.out.println("학생 수를 먼저 입력해주세요");
					
					}else {					// 학생 수가 입력되었다면
						if(selectNo == 2) {
							for(int i=0; i<scores.length; i++) {
								System.out.print("scores[" + (i+1) + "]> ");
								scores[i] = Integer.parseInt(sc.nextLine());	// 점수 입력
							}
						}else if(selectNo == 3) {
							for(int i=0; i<scores.length; i++) {
								System.out.println("scores[" + (i+1) + "]> " + scores[i]);
							}
						}else {
							// 분석 - 총점, 평균, 최고점수
							int sumV = 0;
							double avg = 0;
							int maxV = scores[0];
							
							for(int i=0; i<scores.length; i++) {
								sumV += scores[i];	// 누적 합계
								if(maxV < scores[i]) {	// 다음 점수가 최대값보다 크면
									maxV = scores[i];	//  점수를 최대값으로 설정
								}
							}
							avg = (double)sumV / scores.length;
							
							System.out.println("총점: " + sumV);
							System.out.println("평균: " + avg);
							System.out.println("최고점수: " + maxV);
						}
					}
					
				}else {
					System.out.println("지원되지 않는 메뉴입니다. 다시 선택해 주세요");	// int 중 경우 외의 숫자
				}
				
			}catch(Exception e) {
				System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요");	// int 외의 입력
			}
			
		}	// while끝
		sc.close();
	}

}
