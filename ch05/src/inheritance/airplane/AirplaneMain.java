package inheritance.airplane;

public class AirplaneMain {

	public static void main(String[] args) {
		// SuperSonicAirplane 객체 생성
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		// 초음속 비행
		sa.flyMode = SuperSonicAirplane.SUPER;
		sa.fly();
		// 비행모드
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
