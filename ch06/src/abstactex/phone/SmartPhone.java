package abstactex.phone;

public class SmartPhone extends Phone{		// smartphone에서 add struct

	public SmartPhone(String owner) {
		super(owner);	// 부모 생성자 상속
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
