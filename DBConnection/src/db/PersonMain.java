package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {

		PersonDAO dao = new PersonDAO();
	
		// 자료 삽입
//		Person person1 = new Person("sky", "sky1234", "강하늘", 30);
//		dao.insertPerson(person1);	// dao의 insertPerson() 호출
//		Person person1 = new Person("test", "test1234", "tester", 30);
//		dao.insertPerson(person1);
		
		// 자료 1개 검색
//		Person person = dao.getPerson("cloud");
//		String userId = person.getUserId();		// 출력위해 변수처리
//		String userPw = person.getUserPw();
//		String name = person.getName();
//		int age = person.getAge();
//		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", userId, userPw, name, age);
//		System.out.println();
		
		// 자료 삭제
//		dao.deletePerson("test");
		
		// 자료 수정
//		// id가 'cloud'인 사람 검색
//		Person cloud = dao.getPerson("cloud");
//		// 변경 자료 입력
//		cloud.setName("클라우드");
//		cloud.setAge(50);
//		// 수정
//		dao.updatePerson(cloud);
		
		// 전체 목록 조회
		ArrayList<Person> personList = dao.getPersonList();		// import
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);		// 어레이리스트의 요소를 가져와서 저장

			String userId = person.getUserId();		// 출력위해 변수처리
			String userPw = person.getUserPw();
			String name = person.getName();
			int age = person.getAge();
			
			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", userId, userPw, name, age);
		}
		
	}

}
