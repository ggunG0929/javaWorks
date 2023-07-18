package collections.member;

public class Member {
	private int memberId;		// 회원 아이디
	private String memberName;	// 회원 이름
	
	// 생성자
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// 우클>source>getter, setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// 우클>source>override>tostring
	@Override
	public String toString() {
		return memberId + ", " + memberName;
	}

}
