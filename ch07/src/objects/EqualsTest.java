package objects;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("오상식");
		String name2 = new String("오상식");
		
		// 객체의 메모리 주소 비교
		System.out.println(name1 == name2);			// false
		// 객체의 값을 비교(문자열)
		System.out.println(name1.equals(name2));	// true
		
		System.out.println("=======");
		
		Book book1 = new Book(1, "혼공 자바");
		Book book2 = new Book(1, "혼공 자바");
		
		System.out.println(book1 == book2);			// false
		System.out.println(book1.equals(book2));	// false - 잘못됨, 재정의 필요	// 재정의 후 true
		
		System.out.println("=======");
		
		// hashCode() 테스트 - 메모리 주소 반환(10진수 출력)
		// name1, name2는 같다
		System.out.println(name1.hashCode());	// 50325344
		System.out.println(name2.hashCode());	// 50325344		// 왜 같지??
		
		// book1, book2는 다르다	// 재정의 후 bookNumber를 반환하여 같아짐
		// 동일 객체로 인정하려면 hashCode()와 equals()가 재정의 되어야 함
		System.out.println(book1.hashCode());	// 1651191114
		System.out.println(book2.hashCode());	// 1586600255

	}

}
