package singleton;

public class Company {
	// 유일하게 생성한 인스턴스(Company 클래스의 객체)
	private static Company instance = new Company();
	
	// 기본 생성자
	private Company() {}
	
	// instance에 접근(사용)할 메서드 생성
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
