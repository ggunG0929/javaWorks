package strings;

public class StringTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		// 객체의 메모리 주소 확인 - System.identityHashCode()
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(javaStr));		// 1365202186
		
		System.out.println(androidStr);
		System.out.println("처음 문자열 주소값: " + System.identityHashCode(androidStr));		// 1651191114
		
		// 문자열 연결 - concat() 사용 -> 메모리 주소가 처음과 바뀜
		// 내부에 변경 불가능한 final char[] 변수를 가지고 있음
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연결 후 문자열 주소값: " + System.identityHashCode(javaStr));		// 1586600255
	}

}
