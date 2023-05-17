package whileexample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행 업무 - 예금, 출금, 잔고확인
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;		// 은행 잔고
		boolean run = true;		// 상태변수
		int money = 0;
		
		while(run) {
			try {
				System.out.println("================================");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("================================");
				System.out.print("선택> ");
				
				int selNum = Integer.parseInt(sc.nextLine());	// "1"(문자)을 1(숫자)로 변환
				
				switch(selNum) {
				case 1:
					System.out.print("예금액> ");
					// 잔고 = 잔고 + 예금액
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%,d원 정상처리 되었습니다.\n", money);
					break;
				case 2:
					System.out.print("출금액> ");
					// 잔고 = 잔고 - 출금액
					money = Integer.parseInt(sc.nextLine());
					balance -= money;
					if(balance < 0) {	// 잔고부족상황 임의로 만들어봄
						balance += money;
						System.out.println("잔액이 부족하여 출금을 취소합니다.");
					}else{
						System.out.printf("%,d원 정상처리 되었습니다.\n", money);
					}
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4:
					run = false;	// 종료
					break;
				default:
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요");		// 경우의 수 범위를 벗어나는 숫자를 입력했을 때
					break;
				}
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");	// 입력이 숫자가 아닌 경우
			}

		}	// while() 닫기
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
