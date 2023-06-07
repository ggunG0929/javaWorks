package exception;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			findClass();	// surround try catch
			System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();	// 오류추적
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		// throws - 예외처리 미루기(사용하는 쪽에서 try~catch 함)
//		Class.forName("java.lang.String");	// 클래스 존재함	// add throws declaration
//		Class.forName("java.lang.String2");		// 클래스 존재하지 않음
		Class.forName("java.util.ArrayList2");	// 클래스 존재하지 않음
	}

}
