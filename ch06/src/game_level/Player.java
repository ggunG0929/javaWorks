package game_level;

public class Player {
	
	// 필드
	private PlayerLevel level;
	
	// 생성자
	public Player() {
		level = new Beginner();
		level.showLevelMessage();	// 초보자
	}
	
	// showLevelMessage()를 변경하는 메서드(매개변수의 다형성)
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;		// setLevel의 역할! 빼먹으면 초급자에서 변경이 안됨
		level.showLevelMessage();
	}
	
	// play 메서드
	public void play(int count) {
		level.go(count);
	}
	
}
