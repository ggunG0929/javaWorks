package strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));	// 1023487453
		
		// buffer의 메모리 주소값은 문자 연결 후 변경되지 않음
//		StringBuilder buffer = new StringBuilder(javaStr);		// builder
		StringBuffer buffer = new StringBuffer(javaStr);		// buffer 임의로 해봄
		System.out.println(buffer);
		System.out.println("연산 전 주소값: " + System.identityHashCode(buffer));		// 1651191114
		
		// 문자열 연결
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println(buffer);
		System.out.println("연산 후 주소값: " + System.identityHashCode(buffer));		// 1651191114
	}

}
