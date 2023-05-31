package interfaceex.remocon;

public class SmartTV implements RemoteControl, Searchable {		// add unimplemented method
	
	private int volume;		// 따로 선언

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨은 " + this.volume + "입니다.");
	}

}
