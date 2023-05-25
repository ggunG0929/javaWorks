package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("조혜원", 10000);
		Person p2 = new Person("안민상", 20000);
		
		// 버스 객체 생성
		Bus bus740 = new Bus("버스740");
		
		// 택시 객체 생성
		Taxi kakao = new Taxi("카카오");
		
		p1.take(bus740, 1300);
		p2.take(bus740, 1300);
		p2.take(kakao, 4800);
		
		p1.showInfo();
		p2.showInfo();
		bus740.showInfo();
		kakao.showInfo();
	}

}
