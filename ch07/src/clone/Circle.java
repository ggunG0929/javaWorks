package clone;

// clone()을 사용하려면 cloneable 인터페이스를 구현해야 함
public class Circle implements Cloneable {
	Point center;	// 중심점
	int radius;		// 반지름
	
	Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}
	
	// 우클>source>override/implement method>toString, clone
	@Override
	public String toString() {
		return "중심점은 " + center + "이고, 반지름은 " + radius + "입니다.";
	}

	// 복제를 구현하는 메서드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
