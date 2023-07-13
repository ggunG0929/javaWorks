package collections.nestedclass.innerinterface;

public class Button {
	
	private OnClickListener listener;	// 내부 인터페이스 필드
	
	interface OnClickListener{	// 내부 인터페이스
		public void onClick();
	}
	
	public void setListenner(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 버튼 터치 메서드
	public void touch() {
		listener.onClick();
	}
}
