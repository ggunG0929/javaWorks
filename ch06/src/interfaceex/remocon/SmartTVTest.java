package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		
		// SmartTV 객체 생성
		SmartTV stv = new SmartTV();
		
		stv.turnOn();
		stv.search("www.google.com");
		stv.setVolume(8);
		RemoteControl.changeBattery();		// 정적메서드 - 인터페이스 이름으로 직접 사용
		stv.turnOff();
		
		System.out.println("========================");
		// 부모형으로 형변환 - 다형성 활용
		RemoteControl rc = stv;
		Searchable searchable = stv;
		
		rc.turnOn();
		searchable.search("www.naver.com");
		RemoteControl.changeBattery();
		rc.turnOff();
		
	}

}
