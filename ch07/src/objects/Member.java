package objects;

public class Member {
	
	String id;
	
	Member(String id) {
		this.id = id;
	}
	
	// 우클>source>override implement methods>hashCode, equals 체크

	@Override
	public int hashCode() {
		return id.hashCode();	// 값을 읽어온다고 생각하면 됨
	}

	@Override
	public boolean equals(Object obj) {
		// 강제 형변환
		if(obj instanceof Member) {	// obj가 Book의 인스턴스(객체)라면
			Member member = (Member)obj;	// 강제 형변환 - 다운 캐스팅
//			if(this.id == member.id) {	// 내답
			if(id.equals(member.id)) {	// 선생님답 equals를 재정의 하면서 equals를 활용해도 되는 듯?
				return true;	// true 반환
			}
		}
		return false;
	}

}
