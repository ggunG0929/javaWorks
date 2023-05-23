package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	// 통장 계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];	// 전역에 위치(배열)
	static Scanner sc = new Scanner(System.in);
//	static int count = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			// 메뉴 선택 변수
			int selectNo = Integer.parseInt(sc.nextLine());		// 문자형을 숫자형으로 변환
			
			if(selectNo == 1) {		// 만약 selectNo를 문자형으로 받았다면, selectNo.equals('1');
				createAccount();	// 계좌 생성
			}else if(selectNo == 2) {
				getAccountList();	// 계좌 목록
			}else if(selectNo == 3) {
				deposit();			// 예금
			}else if(selectNo == 4) {
				withdraw();			// 출금
			}else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}	// while() 끝
	}	// main() 끝

//	// 계좌를 생성하는 함수(내답) - while문이 제대로 안됨. 계좌 생성 후에도 계좌번호를 자꾸 물어봄
//	private static void createAccount() {
//		System.out.println("-------------------------------------");
//		System.out.println("1.계좌생성");
//		System.out.println("-------------------------------------");
//		while(true) {
//			System.out.print("계좌번호: > ");
//			String ano = sc.nextLine();
//			for(int i=0; i<accountArray.length; i++) {
//				if(accountArray[i] != null) {	// 선생님답을 보면 findAccount로 이미 생성된 함수를 이용 - 나도 그걸 보고 응용했으면서 그걸 가져다 쓸 생각을 못함ㅠㅠ
//					String dbAno = accountArray[i].getAno();
//					if(dbAno.equals(ano)) {		// 찾는 계좌와 일치하면
//						System.out.println("중복계좌입니다. 다시 입력해주세요");
//					}
//					// 끊고 dbAno.equls(ano)로 해도 되는지
//				}else {
//					System.out.print("계좌주: > ");
//					String owner = sc.nextLine();
//					System.out.print("초기입금액: > ");
//					int balance = Integer.parseInt(sc.nextLine());
//					accountArray[i] = new Account(ano, owner, balance);
//					System.out.println("결과: 계좌가 생성되었습니다.");
//					break;
//				}
//				break;
//			}
//		}	// while문 끝 
//	}
	// 계좌를 생성하는 함수(선생님답)
	private static void createAccount() {
		System.out.println("-------------------------------------");
		System.out.println("1.계좌생성");
		System.out.println("-------------------------------------");
		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();

			if(findAccount(ano) != null) {	// 이부분만 새로 추가
				System.out.println("결과: 중복 계좌입니다. 다시 입력해 주세요.");

			}else {
				System.out.print("계좌주: > ");
				String owner = sc.nextLine();
				System.out.print("초기입금액: > ");
				int balance = Integer.parseInt(sc.nextLine());
				for(int i=0; i<accountArray.length; i++) {
					if(accountArray[i] == null) {	// 배열이 빈 경우에만 생성, 비어있지않다면 다음 배열로
						accountArray[i] = new Account(ano, owner, balance);
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
					}
				}
				break;	// 정상적으로 계좌 생성 빠져나옴
			}	// if else 끝
		}	// 내부 while 끝
	}
	// 계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {	// 배열의 요소가 null이 아닌 경우
				System.out.print("계좌번호: " + accountArray[i].getAno() + "\t");
				System.out.print("계좌주: " + accountArray[i].getOwner() + "\t");
				System.out.println("잔액: " + accountArray[i].getBalance());
			}
		}
	}
	
	// 계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-------------------------------------");
		System.out.println("3.예금");
		System.out.println("-------------------------------------");
		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
			if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				System.out.print("입금액: > ");	// 임의로 위치 변경 계좌번호가 없으면 바로 입금액 입력으로 넘어가지 않게
				int money = Integer.parseInt(sc.nextLine());
				Account account = findAccount(ano);
				// 예금 = 잔고 + 예금액
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리 되었습니다.");
				break;
			}else {
				System.out.println("결과: 계좌가 존재하지 않습니다.");
			}
		}
	}
	
	// 계좌에서 출금하는 메서드
	private static void withdraw() {
		System.out.println("-------------------------------------");
		System.out.println("4.출금");
		System.out.println("-------------------------------------");
		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
			if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				while(true) {
					System.out.print("출금액: > ");
					int money = Integer.parseInt(sc.nextLine());
					Account account = findAccount(ano);
					// 출금 = 잔고 - 출금액
					if(account.getBalance()>=money ) {	// 출금액이 적다면
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리 되었습니다.");
						break;
					}else {		// 출금액이 많다면
						System.out.println("결과: 잔액이 부족합니다. 다시 입력해주세요");
					}
				}
				break;
			}else {
				System.out.println("결과: 계좌가 존재하지 않습니다.");
			}
		}
	}
	
	// 계좌를 검색하는 메서드(return이 있는, void가 없는 함수)
	private static Account findAccount(String ano) {
		Account account = null;	// 빈 계좌 계정을 할당
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {	// 없는 계좌를 입력하면 null 예외 발생
				String dbAno = accountArray[i].getAno();  // 이미 저장된 계정
				if(dbAno.equals(ano)) {		// 찾는 계좌와 일치하면
					account = accountArray[i];	// 계좌를 가져와 저장
					break;	// 빠져나옴
				}
			}
		}
		return account;
	}
	
}	// class 끝
