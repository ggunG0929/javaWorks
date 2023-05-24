package singleton.card;

public class Card {
	private static int serialNum = 100;
	private int cardNum;	// 카드번호
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	
	// 카드번호를 가져오는 함수 정의
	public int getCardNum() {
		return cardNum;
	}

}
