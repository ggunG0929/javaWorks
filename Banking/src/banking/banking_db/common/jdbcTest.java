package banking.banking_db.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {		// Java Database Connectivity

	// 필드
	static String driverClass = "oracle.jdbc.OracleDriver";		// 오라클 드라이버
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";	// db경로(위치) 오라클 새접속 눌러서 접속유형 - 세부정보
	static String username = "c##mydb";		// 오라클 아이디
	static String password = "mydb";		// 오라클 비번
	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName(driverClass);		// 이것만 적은 후에 붉은 선에 대고 try catch 선택, 클릭
			System.out.println("Oracle 드라이버 로딩");
			conn = DriverManager.getConnection(url, username, password);	//add catch clause surrounding try 선택, 클릭
			System.out.println("Connection 객체 생성: " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
