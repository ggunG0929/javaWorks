package banking.banking_db.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// db 연결 및 종료 기능을 하는 클래스
public class JDBCUtil {
	// 필드
	static String driverClass = "oracle.jdbc.OracleDriver";		// 오라클 드라이버
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";	// db경로(위치) 오라클 새접속 눌러서 접속유형 - 세부정보
	static String username = "c##mydb";		// 오라클 아이디
	static String password = "mydb";
	
	// DB 연결 메서드
	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// DB 연결 종료 메서드(ResultSet이 없는 경우 - 삽입, 수정, 삭제)
	public static void close(Connection conn, PreparedStatement pstmt) {
		if(pstmt != null) {		// sql처리가 되고있다면
			try {
				pstmt.close();	// surround with try catch로 자동작성
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {		// finally는 추가작성
				pstmt = null;
			}
		}
		if(conn != null) {		// db가 연결이 되어있다면
			try {
				conn.close();	// surround with try catch
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {		// finally는 추가작성
				conn = null;
			}
		}
	}
	// DB 연결 종료 메서드(ResultSet이 있는 경우 - 검색)
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {		// rs 추가
		if(rs != null) {		// 가져올 자료가 있으면
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {		// finally는 추가작성
				rs = null;
				}
		}
		if(pstmt != null) {		// sql처리가 되고있다면
			try {
				pstmt.close();	// surround with try catch로 자동작성
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {		// finally는 추가작성
				pstmt = null;
			}
		}
		if(conn != null) {		// db가 연결이 되어있다면
			try {
				conn.close();	// surround with try catch
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {		// finally는 추가작성
				conn = null;
			}
		}
	}

}
