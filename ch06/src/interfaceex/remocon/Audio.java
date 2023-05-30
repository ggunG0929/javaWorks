package interfaceex.remocon;

public class Audio implements RemoteControl{	// add unimplemented methods
	
	private int volume;		// 따로 선언
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;		// 최대 볼륨
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;		// 최소 볼륨
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨은 " + this.volume + "입니다.");
	}
	
}
