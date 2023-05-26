package interfaceex.remocon;

public class Television implements RemoteControl{	// add unimplemented methods

	// 필드
	private int volume;		// this.volume에서 지정되는 volume(출력값)
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {		// 입력값
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
	}

}
