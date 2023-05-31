package interfaceex.remocon;

public interface RemoteControl {
	// 상수 - final을 주지 않아도 됨 컴파일러가 자동생성
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드(abstract method)
	public void turnOn();
	
	public void turnOff();
	
	public void setVolume(int volume);
	
	// 디폴트 메서드(실체 메서드) - 무음 처리 / 해제 - 디폴트를 삭제하면 오류남
	default void setMute(boolean mute) {
		if(mute) {	// mute == true
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드도 사용 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
