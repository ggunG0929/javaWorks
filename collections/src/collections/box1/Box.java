package collections.box1;

public class Box<T> {
	private T type;
	
	public void set(T type) {	// 반환형 필요없으니 void
		this.type = type;
	}
	public T get() {
		return type;
	}

}
