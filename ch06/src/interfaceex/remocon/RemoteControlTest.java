package interfaceex.remocon;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 부모 타입으로 형 변환
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(11);
		rcTV.setMute(true);		// 무음 처리
		rcTV.setMute(false);	// 무음 해제
		RemoteControl.changeBattery();		// 인터페이스 이름으로 직접 접근(정적 메서드니까)
		rcTV.turnOff();
		
		System.out.println("=====================");
		
		rcAudio.turnOn();
		rcAudio.setVolume(-3);
		rcAudio.setMute(true);		// 무음 처리
		rcAudio.setMute(false);	// 무음 해제
		RemoteControl.changeBattery();		// 인터페이스 이름으로 직접 접근(정적 메서드니까)
		rcAudio.turnOff();	
	}

}
