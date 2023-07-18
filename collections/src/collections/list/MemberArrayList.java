package collections.list;

import java.util.ArrayList;

import collections.member.Member;

// Member 클래스를 관리(CRUD)하는 클래스 - DAO역할
public class MemberArrayList {
	
	// ArrayList 객체 선언
	ArrayList<Member> arrayList;	// import arraylist, member
	
	// 생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	// 회원 생성 메서드
	public void addMember(Member member) {	// 함수 정의
		arrayList.add(member);	// 기본제공되는 함수 활용
	}
	
	// 회원 목록 보기 메서드
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}

	// 회원 1명 보기
	public void showOne(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();	// 이미 저장된 memberId에 변수 할당
			if(memberId == dbId) {	// 외부에 입력한 아이디와 같으면
				Member member = arrayList.get(i);	// member 객체 생성(할당)
				System.out.println(member);
			}
		}
	}
	
	// 회원 삭제 메서드
	public void removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();
			if(memberId == dbId) {	// 외부에 입력한 아이디와 같으면
				arrayList.remove(i);	// member 객체 생성(할당)
				return;
			}
		}
		System.out.println(memberId + "는 존재하지 않아 삭제할 수 없습니다.");
	}
}
