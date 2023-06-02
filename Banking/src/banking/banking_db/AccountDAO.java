package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.banking_db.common.JDBCUtil;

public class AccountDAO {
	// 전역 변수
	private Connection conn = null;		// connection java.sql
	private PreparedStatement pstmt = null;		// preparedstatement java.sql
	private ResultSet rs = null;		// resultset java.sql
	
	Scanner sc = new Scanner(System.in);
	
	// 계좌를 검색하는 메서드(계좌 1개 가져오기)
	public Account findAccount(String ano) {
		Account account = null;	// 빈 계좌 계정을 할당
		
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);		// conn surround with try catch
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {										// 계좌가 존재한다면
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
					
				account = new Account(ano, owner, balance);		// 그 정보를 account에 저장
			}													// 계좌가 존재하지 않는다면 null
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
}

	// 계좌를 생성하는 함수
	public void createAccount() {
		System.out.println("----------------------------------------------------");
		System.out.println("1.계좌생성");
		
		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
				
			// 중복 계좌 오류 해결
			if(findAccount(ano) != null) {
				System.out.println("결과: 중복 계좌입니다. 다시 입력해 주세요.");
			}else {
				System.out.print("계좌주: > ");
				String owner = sc.nextLine();
				
				System.out.print("초기입금액: > ");
				int balance = Integer.parseInt(sc.nextLine());
					
				conn = JDBCUtil.getConnection();			// db와 연결
				String sql = "INSERT INTO account VALUES (?, ?, ?)";
				try {
					pstmt = conn.prepareStatement(sql);		// sql문을 db에 입력할 준비	// conn surround with try catch
					pstmt.setString(1, ano);				// sql문 세팅
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate();					// db에 저장
					System.out.println("결과: 계좌가 정상 생성되었습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);			// 연결 종료
				}
				break;
			}
		}
	}
		
	// 계좌 목록을 출력하는 메서드
	public void getAccountList() {
		System.out.println("----------------------------------------------------");
		System.out.println("2.계좌목록");
		
		ArrayList<Account> accountList = new ArrayList<>();		// arraylist java.util
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);		// conn surround with try catch
			rs = pstmt.executeQuery();
			while(rs.next()) {	// rs.next()가 true(자료가 존재)하면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");						// 검색한 결과를 가져옴
				
				Account account = new Account(ano, owner, balance);		// 결과를 account로 만듬
				accountList.add(account);								// account를 list로 만듬
			}
			// 화면에 출력
			for(int i=0; i<accountList.size(); i++) {					// accountlist 정보를 가져와서 모든 list를 출력
				System.out.print("계좌번호: " + accountList.get(i).getAno() + "\t");
				System.out.print("계좌주: " + accountList.get(i).getOwner() + "\t");
				System.out.println("잔액: " + accountList.get(i).getBalance());
			}
		} catch (SQLException e) {		// import java.sql
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}	
	}
		
	// 계좌에 입금하는 메서드
	public void deposit() {
		System.out.println("----------------------------------------------------");
		System.out.println("3.예금");

		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
			
			if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				System.out.print("입금액: > ");	// 임의로 위치 변경 계좌번호가 없으면 바로 입금액 입력으로 넘어가지 않게
				int money = Integer.parseInt(sc.nextLine());
				
				Account account = findAccount(ano);		// 입력한 계좌를 가져옴
//				String owner = account.getOwner();
				
				// 예금 = 잔고 + 예금액
				int balance = account.getBalance() + money;
				
				conn = JDBCUtil.getConnection();
//				String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
				String sql = "UPDATE account SET balance = ? WHERE ano = ?";	// 임의로 owner 생략 - 됨
				try {
					pstmt = conn.prepareStatement(sql);		// conn surround with try catch
//					pstmt.setString(1, owner);
//					pstmt.setInt(2, balance);
					pstmt.setInt(1, balance);
//					pstmt.setString(3, ano);
					pstmt.setString(2, ano);
					pstmt.executeUpdate();	// db에 저장
					System.out.printf("결과: %d원 입금이 정상 처리되었습니다.\n", money);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("결과: 계좌가 존재하지 않습니다. 다시 입력해 주세요.");
			}
		}
	}
		
	// 계좌에서 출금하는 메서드
	public void withdraw() {
		System.out.println("----------------------------------------------------");
		System.out.println("4.출금");

		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
			if(findAccount(ano) != null) {	// 계좌를 찾았다면(반환값이 있다면)
				while(true) {
					System.out.print("출금액: > ");
					int money = Integer.parseInt(sc.nextLine());
					Account account = findAccount(ano);
					if(account.getBalance()>=money ) {	// 출금액이 적다면
						// 출금 = 잔고 - 출금액
						int balance = account.getBalance() - money;
						String owner = account.getOwner();
						
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
						try {
							pstmt = conn.prepareStatement(sql);		// conn surround with try catch
							pstmt.setString(1, owner);
							pstmt.setInt(2, balance);
							pstmt.setString(3, ano);
							pstmt.executeUpdate();	// db에 저장
							System.out.printf("결과: %d원 출금이 정상 처리되었습니다.\n", money);
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
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
	
	public void deleteAccount() {
		System.out.println("----------------------------------------------------");
		System.out.println("5.계좌삭제");

		while(true) {
			System.out.print("계좌번호: > ");
			String ano = sc.nextLine();
				
			if(findAccount(ano) == null) {
				System.out.println("결과: 없는 계좌입니다. 다시 입력해 주세요.");
			}else {					
				conn = JDBCUtil.getConnection();
				String sql = "DELETE FROM account WHERE ano = ?";
				try {
					pstmt = conn.prepareStatement(sql);		// conn surround with
					pstmt.setString(1, ano);
					pstmt.executeUpdate();	// db에 계좌 저장
					System.out.println("결과: 계좌가 정상 삭제되었습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}
		}
	}
}
