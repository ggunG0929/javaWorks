package collections.set;

public class Student {
	String name;
	int age;
	
	// 생성자		// source generate using field
	public Student(String name) {
//		super();
		this.name = name;
	}

	// hashCode() 재정의	// source>override method>hashcode 선택
	@Override
	public int hashCode() {		// hashCode() - 십진수로 출력됨
//		return super.hashCode();
		return name.hashCode();	// 숫자로 반환해 줌
	}

	// equals() 재정의	// source>override method>equals 선택
	@Override
	public boolean equals(Object obj) {		// 객체인지 확인하는 명령어 - instanceof
		if(obj instanceof Student) {
			Student std = (Student)obj;	// 객체 생성(저장)
			if(std.name.equals(name))	// 외부에서 입력된 이름과 이미 저장된 이름이 같으면
				return true;	// true를 리턴
		}
//		return super.equals(obj);
		return false;
	}
	
	// toString() 재정의	// source>override method>toString
	@Override
	public String toString() {
		return name;
	}

}
