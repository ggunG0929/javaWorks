package objects;

public class ToStringEx {

	public static void main(String[] args) {
		
//		String name = "강하늘";	// 상수느낌
		String name = new String("강하늘");	// 객체느낌
		
		System.out.println(name);
		System.out.println(name.toString());
		
		System.out.println("===========");
		
		Book book = new Book(1, "혼공 자바");
		System.out.println(book);	// objects.Book@626b2d4a -> 1, 혼공 자바
		// toString() - 객체의 정보를 문자로 출력
		System.out.println(book.toString());
//		book.showInfo();
		
	}

}
